package com.rubik.applistview_musicjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    //private static final String urlJSON;//"http://api.androidhive.info/json/movies.json";
    private List<Album> listAlbum = new ArrayList<Album>();
    private ListView listView;
    private myListviewAdapter adapter;
    public static int SELECTED_POS = -1;  // control selected row

         @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listAlbum = initAlbumList();
        listView = (ListView) findViewById(R.id.listview);
        adapter = new myListviewAdapter(this, listAlbum);
        listView.setAdapter(adapter);

       // urlJSON = Uri.parse("android.resource://com.music.json");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (view.isActivated()) {
                    SELECTED_POS = -1;
                    view.setActivated(false);
                } else {
                    SELECTED_POS = position;
                    view.setActivated(true);
                }

                Log.d("ITEMCLICK--->",String.valueOf(SELECTED_POS));
                adapter.notifyDataSetChanged();
            }
        });

    }



    private List<Album> initAlbumList() {

        listAlbum.add(new Album("Limp Bizkit","Three Dollar Bill, Y'All$","Nu Metal",R.drawable.three_dollar,"1997"));
        listAlbum.add(new Album("Limp Bizkit","Significant Other","Nu Metal",R.drawable.significant_other_a,"1999"));
        listAlbum.add(new Album("Limp Bizkit","Chocolate Starfish and the Hot Dog Flavored Water","Nu Metal",R.drawable.hotdog,"2000"));
        listAlbum.add(new Album("Limp Bizkit","New Old Songs","Nu Metal",R.drawable.newolds,"2001"));
        listAlbum.add(new Album("Limp Bizkit","Results May Vary","Nu Metal",R.drawable.result,"2003"));
        listAlbum.add(new Album("Limp Bizkit","Gold Cobra","Nu Metal",R.drawable.gold,"2011"));
        listAlbum.add(new Album("Limp Bizkit","Forgotten Muse","Nu Metal",R.drawable.muse,"2014"));

        listAlbum.add(new Album("Limp Bizkit","Three Dollar Bill, Y'All$","Nu Metal",R.drawable.three_dollar,"1997"));
        listAlbum.add(new Album("Limp Bizkit","Significant Other","Nu Metal",R.drawable.significant_other_a,"1999"));
        listAlbum.add(new Album("Limp Bizkit","Chocolate Starfish and the Hot Dog Flavored Water","Nu Metal",R.drawable.hotdog,"2000"));
        listAlbum.add(new Album("Limp Bizkit","New Old Songs","Nu Metal",R.drawable.newolds,"2001"));

        return listAlbum;

    }


}
