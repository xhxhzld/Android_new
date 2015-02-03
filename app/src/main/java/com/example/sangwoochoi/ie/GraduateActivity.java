package com.example.sangwoochoi.ie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by SangwooChoi on 2015-02-01.
 */
public class GraduateActivity extends Activity implements View.OnClickListener {

    EditText text;
    Button graduateACT2;
    Intent intent;

    StudentIDList studentIDList = new StudentIDList();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduate1);  // 레이아웃과 java파일을 연결하는 부분

        text = (EditText) findViewById(R.id.editText7);
        graduateACT2 = (Button) findViewById(R.id.button10);
        graduateACT2.setOnClickListener(GraduateActivity.this);
    }

    public void onClick(View v) {

        if( studentIDList.isContained(text.getText().toString()) != true){

            if( text.getText().toString().equals("07") || text.getText().toString().equals("2007") || text.getText().toString().equals("06") || text.getText().toString().equals("2006")){
                Toast.makeText(getApplicationContext(), "죄송합니다. 현재 지원되지 않는 학번입니다.", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "학번을 올바르게 다시 입력하세요.", Toast.LENGTH_SHORT).show();
            }

        }
        
        else{
            intent = new Intent(GraduateActivity.this, GraduateActivity2.class);
            intent.putExtra("name", text.getText().toString());
            startActivity(intent);
            finish();
        }

    }
 };









