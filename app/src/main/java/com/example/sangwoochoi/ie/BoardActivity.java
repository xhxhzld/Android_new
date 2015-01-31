package com.example.sangwoochoi.ie;
import android.util.Log;
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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class BoardActivity extends Activity  {
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> list_url = new ArrayList<String>();
    ArrayList<String> list = new ArrayList<String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        final String[] values = parsing.Dupli_Sort(parsing.SNUparsing());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);


        Button allpostACT = (Button) findViewById(R.id.button7);
        allpostACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list_url = parsing.selection_url(values, "", "");
                list = parsing.selection(values, "", "");
                ListView listview = (ListView) findViewById(R.id.listView);
                arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, list);
                listview.setAdapter(arrayAdapter);
                listview.setOnItemClickListener(mItemClickListener);
            }
        });

        Button firpostACT = (Button) findViewById(R.id.button8);
        firpostACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list_url = parsing.selection_url(values, "장학", "장학");
                Log.i("IE",list_url.get(0));

                list = parsing.selection(values,"장학", "장학");
                ListView listview = (ListView) findViewById(R.id.listView);
                arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, list);
                listview.setAdapter(arrayAdapter);
                listview.setOnItemClickListener(mItemClickListener);

            }
        });
        Button secpostACT = (Button) findViewById(R.id.button9);
        secpostACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list_url = parsing.selection_url(values, "인턴", "채용");
                list = parsing.selection(values, "인턴", "채용");
                ListView listview = (ListView) findViewById(R.id.listView);
                arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, list);
                listview.setAdapter(arrayAdapter);
                listview.setOnItemClickListener(mItemClickListener);
            }
        });
    }
    private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long l_position) {
                // parent는 AdapterView의 속성의 모두 사용 할 수 있다.
            Bundle extras = new Bundle();
            extras.putString("url", list_url.get(position));
            extras.putString("name",list.get(position));

            Intent intent = new Intent(BoardActivity.this, Board_content.class);
            intent.putExtras(extras);

        startActivity(intent);
            Log.i("IE",list_url.get(position));
        }
    };
}








