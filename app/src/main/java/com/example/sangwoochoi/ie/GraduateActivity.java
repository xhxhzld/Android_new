package com.example.sangwoochoi.ie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by SangwooChoi on 2015-02-01.
 */
public class GraduateActivity extends Activity implements View.OnClickListener {

    EditText text;
    Button graduateACT2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduate1);  // 레이아웃과 java파일을 연결하는 부분

        text = (EditText) findViewById(R.id.editText7);
        graduateACT2 = (Button) findViewById(R.id.button10);
        graduateACT2.setOnClickListener(GraduateActivity.this);
    }

    public void onClick(View v) {

        Intent intent = new Intent(GraduateActivity.this, GraduateActivity2.class);
        intent.putExtra("name", text.getText().toString());
        startActivity(intent);
        finish();
    }
 };









