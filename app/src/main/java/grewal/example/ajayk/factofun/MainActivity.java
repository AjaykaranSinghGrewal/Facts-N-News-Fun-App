package grewal.example.ajayk.factofun;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] titles;
    TypedArray pics;

    List<ItemsInRows> rowItems;
    ListView mylistview;

    private Fact1 fact1 = new Fact1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayShowHomeEnabled(true);
        actionbar.setTitle(R.string.app_name);

        rowItems = new ArrayList<ItemsInRows>();
        titles = getResources().getStringArray(R.array.titles);
        pics = getResources().obtainTypedArray(R.array.pics);

        for (int i = 0; i < titles.length; i++) {
            ItemsInRows item = new ItemsInRows(titles[i], pics.getResourceId(i, -1));
            rowItems.add(item);
        }

        mylistview = (ListView) findViewById(R.id.list);
        CustomAdapter adapter = new CustomAdapter(this, rowItems);
        mylistview.setAdapter(adapter);
        pics.recycle();
        mylistview.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position==0){
            Intent intent = new Intent(view.getContext(), Fact1.class);
            startActivity(intent);
        }
        if (position==1){
            Intent intent = new Intent(view.getContext(), Fact2.class);
            startActivity(intent);
        }
        if (position==2){
            Intent intent = new Intent(view.getContext(), Fact3.class);
            startActivity(intent);
        }
        if (position==3) {
            Intent intent = new Intent(view.getContext(), Fact4.class);
            startActivity(intent);
        }
        if (position==4) {
            Intent intent = new Intent(view.getContext(), Fact5.class);
            startActivity(intent);
        }
        if (position==5) {
            Intent intent = new Intent(view.getContext(), Fact6.class);
            startActivity(intent);
        }
        if (position==6) {
            Intent intent = new Intent(view.getContext(), Fact7.class);
            startActivity(intent);
        }
        if (position==7) {
            Intent intent = new Intent(view.getContext(), NumberJSON.class);
            startActivity(intent);
        }
        if (position==8) {
            Intent intent = new Intent(view.getContext(), JokeJSON.class);
            startActivity(intent);
        }
        if (position==9) {
            Intent intent = new Intent(view.getContext(), JokeJSON2.class);
            startActivity(intent);
        }
        if (position==10){
            Intent intent = new Intent(view.getContext(), NewsJSON.class);
            startActivity(intent);
        }
        if (position==11){
            Intent intent = new Intent(view.getContext(), NewsJSON1.class);
            startActivity(intent);
        }
        if (position==12){
            Intent intent = new Intent(view.getContext(), NewsJSON2.class);
            startActivity(intent);
        }
        if (position==13){
            Intent intent = new Intent(view.getContext(), NewsJSON3.class);
            startActivity(intent);
        }
        if (position==14){
            Intent intent = new Intent(view.getContext(), NewsJSON4.class);
            startActivity(intent);
        }
        if (position==15){
            Intent intent = new Intent(view.getContext(), KuttaJSON.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Close the App?").setMessage("Are you sure you want to exit the application?").setPositiveButton("Yes", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No", null).show();
    }
}
