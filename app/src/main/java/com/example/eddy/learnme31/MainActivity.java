package com.example.eddy.learnme31;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //string array of tv shows
        String[] favoriteTVShows = {"Random Item 1", "Random Item 2","Random Item  3","Random Item  4","Random Item  5","Random Item  6"};

        //string adapter - takes listview and structures by a specific layout
        ListAdapter theAdapter = new ArrayAdapter<String>(this,R.layout.row_layout,favoriteTVShows);

        //new listview from activity_main (by id)
        ListView theListView = (ListView) findViewById(R.id.theListView);

        // create the listview through the listadapter
        theListView.setAdapter(theAdapter);


        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String tvShowPicked = "You picked " + String.valueOf(adapterView.getItemAtPosition(position));

                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
