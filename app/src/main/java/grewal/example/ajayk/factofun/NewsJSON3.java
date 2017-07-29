package grewal.example.ajayk.factofun;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NewsJSON3 extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();
    private ListView mListView;
    private RelativeLayout mRelativeLayout;
    private NewsGetJSON mNewsGetJson;
    private TextView mNewsTitle;
    private TextView mNewsDescription;
    private TextView mNewsPublished;
    //private ColorWheel mColorWheel = new ColorWheel();

    ArrayList<HashMap<String, String>> newsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_json);


        mRelativeLayout = (RelativeLayout) findViewById(R.id.mRelativeLayout);
        mListView = (ListView) findViewById(R.id.list_news);
        mNewsTitle = (TextView) findViewById(R.id.newsheading);
        mNewsDescription = (TextView) findViewById(R.id.newsdescription);
        mNewsPublished = (TextView) findViewById(R.id.publishedTextView);

        /*int color = mColorWheel.getColor();
        mRelativeLayout.setBackgroundColor(color);*/
        String newsUrl = "https://newsapi.org/v1/articles?source=buzzfeed&apiKey=923cec3787c64da2b93a9ac3fba2b2cb";

        if(networkIsAvailable()){

            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(newsUrl).build();
            Call call = client.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try{
                        String jsonData = response.body().string();
                        if (response.isSuccessful()){
                            mNewsGetJson = getCurrentNews(jsonData);

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    updateDisplay();
                                }
                            });
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        else {
            alertUserAboutError();
        }
    }

    private void updateDisplay() {
        //Picasso.with(this).load(mJokeGetJSON.getJokeGet()).into(mJokeLabel);
        ListAdapter adapter = new SimpleAdapter(NewsJSON3.this, newsList, R.layout.news_list, new String[]{"title", "description", "publishedAt"}, new int[]{R.id.newsheading, R.id.newsdescription, R.id.publishedTextView});
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                AlertDialogWeb3 dialog = new AlertDialogWeb3();
                dialog.show(getFragmentManager(), "error_dialog");
            }
        });
    }


    private NewsGetJSON getCurrentNews(String jsonData) throws JSONException {
        JSONObject news = new JSONObject(jsonData);
        JSONArray articles = news.getJSONArray("articles");
        NewsGetJSON newsGetJson = new NewsGetJSON();


        for (int i = 0; i < articles.length(); i++){

            JSONObject c = articles.getJSONObject(i);
            newsGetJson.setNewsTitle(c.getString("title"));
            newsGetJson.setNewsDescription(c.getString("description"));
            newsGetJson.setNewsPublished(c.getString("publishedAt"));

            HashMap<String, String> newNews = new HashMap<>();

            newNews.put("title",newsGetJson.getNewsTitle());
            newNews.put("description", newsGetJson.getNewsDescription());
            newNews.put("publishedAt", newsGetJson.getNewsPublished());

            newsList.add(newNews);
        }
        return null;
    }

    private boolean networkIsAvailable() {
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

    private void alertUserAboutError() {
        AlertDialog dialog = new AlertDialog();
        dialog.show(getFragmentManager(), "error_dialog");
    }
}
