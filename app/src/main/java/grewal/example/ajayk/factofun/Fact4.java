package grewal.example.ajayk.factofun;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Fact4 extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private FactBookWorldRecords mFactBook = new FactBookWorldRecords();
    private ColorWheel mColorWheel = new ColorWheel();
    private ImageBookWorldRecords mDogImage = new ImageBookWorldRecords();

    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    private ImageView mImageView;
    private TextToSpeech mTTS;
    private Intent mShareIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact4);

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mImageView = (ImageView) findViewById(R.id.showImageView);
        mTTS = new TextToSpeech(this, this);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();
                //int imageWorld = mDogImage.getWorldImage();

                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
                //mImageView.setImageResource(imageWorld);
                mImageView.setImageBitmap(ExceptionImageHandling.decodeSampledBitmapFromResource(getResources(), mDogImage.getWorldImage(), 150, 150));
            }
        };
        mShowFactButton.setOnClickListener(listener);
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

    private void share() {
        mShareIntent = new Intent(Intent.ACTION_SEND);
        mShareIntent.setType("text/plain");
        mShareIntent.putExtra(Intent.EXTRA_SUBJECT, "Fact-N-News");
        mShareIntent.putExtra(Intent.EXTRA_TEXT, "Fun Fact: " + mFactTextView.getText().toString());
        startActivity(Intent.createChooser(mShareIntent, "Share Via"));
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

    private void speak() {
        String textToSpeak = mFactTextView.getText().toString();
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
}
