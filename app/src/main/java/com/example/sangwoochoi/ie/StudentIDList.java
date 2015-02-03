package com.example.sangwoochoi.ie;

import java.util.ArrayList;

/**
 * Created by SangwooChoi on 2015-02-04.
 */
public class StudentIDList {

    private ArrayList<String> studentIDList = new ArrayList<String>();

    public StudentIDList(){

        this.studentIDList.add("08");
        this.studentIDList.add("2008");
        this.studentIDList.add("09");
        this.studentIDList.add("2009");
        this.studentIDList.add("10");
        this.studentIDList.add("2010");
        this.studentIDList.add("11");
        this.studentIDList.add("2011");
        this.studentIDList.add("12");
        this.studentIDList.add("2012");
        this.studentIDList.add("13");
        this.studentIDList.add("2013");
        this.studentIDList.add("14");
        this.studentIDList.add("2014");
        this.studentIDList.add("15");
        this.studentIDList.add("2015");
    }

    public boolean isContained(String text){
        return this.studentIDList.contains(text);
    }

}
