package com.example.sangwoochoi.ie;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.widget.*;
import java.util.ArrayList;
import android.os.*;
import android.view.*;
import android.content.*;

public class BoardActivity extends Activity {
    ArrayAdapter<String> arrayAdapter;
    final ArrayList<String> list = new ArrayList<String>();

    public void onCreate(Bundle savedInstanceState) {

        if(android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        final String[] values = parsing.Dupli_Sort(parsing.SNUparsing());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);


        Button allpostACT = (Button)findViewById(R.id.button7);
        allpostACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListView listview = (ListView) findViewById(R.id.listView);
                arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, parsing.selection(values, "", ""));
                listview.setAdapter(arrayAdapter);
                listview.setOnItemClickListener(thisitem);
            }
        });

        Button firpostACT = (Button)findViewById(R.id.button8);
        firpostACT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ListView listview= (ListView)findViewById(R.id.listView);
                arrayAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,parsing.selection(values,"장학","장학"));
                listview.setAdapter(arrayAdapter);
                listview.setOnItemClickListener(thisitem);

            }
        });
        Button secpostACT = (Button)findViewById(R.id.button9);
        secpostACT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ListView listview= (ListView)findViewById(R.id.listView);
                arrayAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,parsing.selection(values,"인턴","채용"));
                listview.setAdapter(arrayAdapter);
                listview.setOnItemClickListener(thisitem);
            }
        });

    }
    private AdapterView.OnItemClickListener thisitem = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long l_position) {
            // parent는 AdapterView의 속성의 모두 사용 할 수 있다.
            String row = (String)parent.getAdapter().getItem(position);
            Toast.makeText(getApplicationContext(), row, Toast.LENGTH_SHORT).show();

                    }
    };
}








