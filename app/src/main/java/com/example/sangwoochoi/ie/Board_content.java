package com.example.sangwoochoi.ie;

/**
 * Created by junyoung kim on 2015-01-31.
 */
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
import android.util.Log;
public class Board_content extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.board_content);

        Intent intent = getIntent();
        Log.i("ie", intent.getStringExtra("url"));
        String url = "http://ie.snu.ac.kr"+intent.getStringExtra("url");

        TextView title = (TextView)findViewById(R.id.TextView7);
        title.setText(getIntent().getStringExtra("name"));

        TextView content = (TextView)findViewById(R.id.TextView8);
        content.setText(parsing.content(url));

    }
}