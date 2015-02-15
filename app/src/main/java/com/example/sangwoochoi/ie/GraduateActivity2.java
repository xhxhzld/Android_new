package com.example.sangwoochoi.ie;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.sangwoochoi.ie.CulturalList.CulturalList;

/**
 * Created by SangwooChoi on 2015-02-01.
 */
public class GraduateActivity2 extends Activity {

    ListView listView;

    MajorList majorList = new MajorList();

    Object[] majorList_str = majorList.getList().toArray(new String[majorList.getList().size()]);

    Context context;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent i = getIntent();

        final String inputStudentID = i.getExtras().getString("studentID");

        CulturalList culturalList = new CulturalList(inputStudentID);

        final Object[] culturalList_str = culturalList.getCulturalList().toArray(new String[culturalList.getCulturalList().size()]);

        setContentView(R.layout.activity_graduate2);


        Button majorACT = (Button) findViewById(R.id.button11);
        majorACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listView = (ListView) findViewById(R.id.listView3);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), R.layout.list_item,  (String[]) majorList_str);

                listView.setAdapter(adapter);
                listView.setItemsCanFocus(false);
                listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

            }
        });

        Button culturalACT = (Button) findViewById(R.id.button12);
        culturalACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listView = (ListView) findViewById(R.id.listView3);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), R.layout.list_item, (String[]) culturalList_str);

                listView.setAdapter(adapter);
                listView.setItemsCanFocus(false);
                listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

            }
        });



    }
}
