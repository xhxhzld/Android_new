package com.example.sangwoochoi.ie;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import android.os.*;

public class BoardActivity extends Activity {
    ArrayAdapter<String> arrayAdapter;
    final ArrayList<String> list = new ArrayList<String>();

    public void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        String[] values = parsing.Dupli_Sort(parsing.SNUparsing());


        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }

        ListView listview= (ListView)findViewById(R.id.listView2);
        arrayAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,list);
        listview.setAdapter(arrayAdapter);

    }
}








