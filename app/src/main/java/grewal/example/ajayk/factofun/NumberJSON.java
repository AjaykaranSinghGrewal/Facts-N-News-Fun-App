package grewal.example.ajayk.factofun;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Locale;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NumberJSON extends AppCompatActivity implements TextToSpeech.OnInitListener {
    public static final String TAG = MainActivity.class.getSimpleName();
    private NumberGetJSON mNumberGetJson;
    private RelativeLayout mRelativeLayout;
    private TextView mNumberLabel;
    private ColorWheel mColorWheel = new ColorWheel();
    private ImageView mRefreshJoke;
    private TextView mNumber;
    private TextToSpeech mTTS;
    private Intent mShareIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_json);

        mNumberLabel = (TextView) findViewById(R.id.textViewNumberFact);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.mRelativeLayout);
        mRefreshJoke = (ImageView) findViewById(R.id.imageViewRefresh);
        mNumber = (TextView) findViewById(R.id.textViewNumber);
        mTTS = new TextToSpeech(this, this);
        mRefreshJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update();
            }
        });

        update();
    }

    private void update() {
        int color = mColorWheel.getColor();
        mRelativeLayout.setBackgroundColor(color);
        String jokeUrl = "http://numbersapi.com/random/year?json";
        if(isNetworkAvailable()) {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(jokeUrl).build();
            Call call = client.newCall(request);
            call.enqueue(new Callback(){
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        String jsonData = response.body().string();
                        if (response.isSuccessful()) {
                            mNumberGetJson = getCurrentNumberFact(jsonData);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    updateDisplay();
                                }
                            });
                        } else {
                            alertUserAboutError();
                        }
                    }
                    catch(JSONException e){
                        e.printStackTrace();
                    }
                }
            });
        }
        else{
            Toast.makeText(this, "Network Unavailable", Toast.LENGTH_LONG).show();
        }
    }

    private NumberGetJSON getCurrentNumberFact(String jsonData) throws JSONException {
        JSONObject joke = new JSONObject(jsonData);
        NumberGetJSON numberGetJson = new NumberGetJSON();

        //jokeGetJson.setJokeGet(joke.getString("value"));
        numberGetJson.setNumberFact(joke.getString("text"));
        numberGetJson.setNumber(joke.getInt("number"));

        return numberGetJson;
    }

    private void updateDisplay() {
        mNumberLabel.setText(mNumberGetJson.getNumberFact() + "");
        mNumber.setText(mNumberGetJson.getNumber() + "");
    }

    private void alertUserAboutError() {
        AlertDialog dialog = new AlertDialog();
        dialog.show(getFragmentManager(), "error_dialog");
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int language = mTTS.setLanguage(Locale.US);
            if (language == TextToSpeech.LANG_NOT_SUPPORTED || language == TextToSpeech.LANG_MISSING_DATA) {
                Toast.makeText(getApplicationContext(), "Feature Not Supported", Toast.LENGTH_LONG).show();
            } else {
                speak();
            }
        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();

        boolean isAvailable = false;
        if(networkInfo != null && networkInfo.isConnected()){
            isAvailable = true;
        }
        else{
            isAvailable = false;
        }
        return isAvailable;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.speaker:
                speak();
                break;

            case R.id.speakermute:
                if(mTTS != null){
                    mTTS.stop();
                }
                break;

            case R.id.share:
                share();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void speak() {
        String textToSpeak = mNumberLabel.getText().toString();
        mTTS.speak(textToSpeak, TextToSpeech.QUEUE_FLUSH, null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mTTS != null){
            mTTS.stop();
            mTTS.shutdown();
        }
    }

    private void share() {
        mShareIntent = new Intent(Intent.ACTION_SEND);
        mShareIntent.setType("text/plain");
        mShareIntent.putExtra(Intent.EXTRA_SUBJECT, "Fact-N-News");
        mShareIntent.putExtra(Intent.EXTRA_TEXT, "Did You Know: " + mNumberLabel.getText().toString());
        startActivity(Intent.createChooser(mShareIntent, "Share Via"));
    }
}
