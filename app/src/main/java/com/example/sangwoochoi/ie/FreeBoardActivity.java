package com.example.sangwoochoi.ie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.*;
import android.widget.Button;
import android.widget.ListView;
import android.widget.EditText;
import java.util.ArrayList;
import android.widget.ArrayAdapter;


public class FreeBoardActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   //레이아웃과 연결하는 부분
        Intent idintent = getIntent();
        final String IDname = idintent.getStringExtra("ID");
        setContentView(R.layout.activity_freeboard);

        ListView conListView = (ListView)findViewById(R.id.listView2);
        final EditText conText = (EditText)findViewById(R.id.editText8);

        Button conWrite=(Button)findViewById(R.id.button13);



        final ArrayList<String> conLists = new ArrayList<String>();
        final ArrayAdapter<String> conAdap;
        conAdap=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, conLists);

     //   Button writeACT = (Button) findViewById(R.id.button13);

        conListView.setAdapter(conAdap);

        conWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                conLists.add(0, IDname+"\n\n"+conText.getText().toString());
// (4)
                conAdap.notifyDataSetChanged();
// (5)
                conText.setText("");
//(6)


            }
        });





    }
}
