package grewal.example.ajayk.factofun;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class KuttaJSON extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private JokeGetJSON mJokeGetJSON;
    private RelativeLayout mRelativeLayout;
    private ImageView mJokeLabel;
    private ColorWheel mColorWheel = new ColorWheel();
    private ImageView mRefreshJoke;
    private Intent mShareIntent;
    private Button mWallpaper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kutta_json);

        mJokeLabel = (ImageView) findViewById(R.id.imageViewKutta);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.mRelativeLayout);
        mRefreshJoke = (ImageView) findViewById(R.id.imageViewRefresh);
        mWallpaper = (Button) findViewById(R.id.btnWallpaper);

        mWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setWallpaper();
                    }
                });
            }
        });
        mRefreshJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update();
            }
        });

        update();
    }

    private void setWallpaper() {
        String jokeUrl = "http://thedogapi.co.uk/api/v1/dog?limit=1";
        if(isNetworkAvailable()){

            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(jokeUrl).build();
            Call call = client.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                    try {
                        Bitmap result = Picasso.with(getApplicationContext()).load(mJokeGetJSON.getJokeGet()).get();
                        wallpaperManager.setBitmap(result);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
        else{
            Toast.makeText(this, "Oops!", Toast.LENGTH_LONG).show();
        }
    }

    private void update() {

        String jokeUrl = "http://thedogapi.co.uk/api/v1/dog?limit=1";
        if(isNetworkAvailable()){

            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(jokeUrl).build();
            Call call = client.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        String jsonData = response.body().string();
                        if (response.isSuccessful()) {

                            mJokeGetJSON = getCurrentJoke(jsonData);

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

    private void updateDisplay() {
        //mJokeLabel.setText(mJokeGetJSON.getJokeGet() + "");
        Picasso.with(this).load(mJokeGetJSON.getJokeGet()).into(mJokeLabel);
            }

    private void alertUserAboutError() {
        AlertDialog dialog = new AlertDialog();
        dialog.show(getFragmentManager(), "error_dialog");
    }

    private JokeGetJSON getCurrentJoke(String jsonData) throws JSONException {
        JSONObject joke = new JSONObject(jsonData);
        JSONArray currentJoke = joke.getJSONArray("data");
        JokeGetJSON jokeGetJson = new JokeGetJSON();

        for(int i = 0; i < currentJoke.length(); i++){
            JSONObject jsonObj = currentJoke.getJSONObject(i);
            jokeGetJson.setJokeGet(jsonObj.getString("url"));
        }

        //jokeGetJson.setJokeGet(currentJoke.getString("summary"));
        //jokeGetJson.setJokeGet(joke.getString("value"));



        //Log.d(TAG, jokeGetJson.getJokeGet());

        //return jokeGetJson;
        return jokeGetJson;
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


}
