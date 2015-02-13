package com.example.sangwoochoi.ie;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

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

        String inputStudentID = i.getExtras().getString("studentID");

        /*
        switch(inputStudentID) {
            case "08":
                setContentView(R.layout.activity_graduate2_08);
                break;
            case "2008":
                setContentView(R.layout.activity_graduate2_08);
                break;
            case "09":
                setContentView(R.layout.activity_graduate2_09);
                break;
            case "2009":
                setContentView(R.layout.activity_graduate2_09);
                break;
            case "10":
                setContentView(R.layout.activity_graduate2_10);
                break;
            case "2010":
                setContentView(R.layout.activity_graduate2_10);
                break;
            case "11":
                setContentView(R.layout.activity_graduate2_11);
                break;
            case "2011":
                setContentView(R.layout.activity_graduate2_11);
                break;
            case "12":
                setContentView(R.layout.activity_graduate2_12);
                break;
            case "2012":
                setContentView(R.layout.activity_graduate2_12);
                break;
            case "13":
                setContentView(R.layout.activity_graduate2_13);
                break;
            case "2013":
                setContentView(R.layout.activity_graduate2_13);
                break;
            case "14":
                setContentView(R.layout.activity_graduate2_14);
                break;
            case "2014":
                setContentView(R.layout.activity_graduate2_14);
                break;
        }
        */

        setContentView(R.layout.activity_graduate2);
        context =this;
        listView = (ListView)findViewById(R.id.listView3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, (String[]) majorList_str);

        listView.setAdapter(adapter);
        listView.setItemsCanFocus(false);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }
}
