package com.example.sangwoochoi.ie;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   //레이아웃과 연결하는 부분
        setContentView(R.layout.activity_main);
        Log.i("IE","OnCreate");
        Intent intent = getIntent();
        final String IDname = intent.getStringExtra("ID");

        TextView appname = (TextView)findViewById(R.id.textView4);
        appname.setText("I.E app for "+IDname +"♥");

        Button loginACT = (Button)findViewById(R.id.button4);
        loginACT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BoardActivity.class));
            }
        });

        Button graduateACT = (Button)findViewById(R.id.button6);
        graduateACT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), GraduateActivity.class));
            }
        });

        Button freeboardACT = (Button)findViewById(R.id.button5);
        freeboardACT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent idintent = new Intent(MainActivity.this, FreeBoardActivity.class);
                idintent.putExtra("ID", IDname);
                startActivity(idintent);
            }
        });






}



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("KJ","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("KJ","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("KJ","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("KJ","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("KJ","OnDestroy");
    }
}
