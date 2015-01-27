package com.example.sangwoochoi.ie;

/**
 * Created by junyoung kim on 2015-01-27.
 */
import java.util.*;
import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

public class parsing {
    public static String[] SNUparsing(){
        String date_text = "";
        String context = "";

        try {
            for(int i=1;i<4;i++){
                String link = "http://ie.snu.ac.kr/index.php?mid=Notice&page="+i;
                Document doc  = Jsoup.connect(link).get();

                Elements date = doc.select("td[class=date]");

                for(Element k : date){
                    date_text = date_text+"?"+k.select("td.date").text();

                }


                Elements span = doc.select("td[class=title]");

                for(Element e : span){
                    context=context+"?"+e.select("td.title").text();

                }
            }


        } catch (IOException ex) {
            System.err.println("Error:" + ex.getMessage());
        }
        String[] parsingText = new String[date_text.split("\\?").length-1];
        for(int i=1;i<date_text.split("\\?").length;i++){
            parsingText[i-1] = date_text.split("\\?")[i]+", "+context.split("\\?")[i];
        }
        return parsingText;
    }

    public static String[] Dupli_Sort(String[] array){
        ArrayList al = new ArrayList();
        Collections.addAll(al, array);

        HashSet hashset = new HashSet(al);
        ArrayList al2 = new ArrayList(hashset);
        Collections.sort(al2);
        Collections.reverse(al2);
        String[] New_Array = new String[al2.size()];
        al2.toArray(New_Array);

        return New_Array;

    }




    public static void selection(String[] parsing, String[] ID){
        for(int i=3;i<ID.length;i++){
            if(!ID[i].equals("null")){
                System.out.println("\n"+ID[i]+" 관련 공지입니다.\n");
                for(int k=0;k<parsing.length-1;k++){
                    if(parsing[k].contains(ID[i])){
                        System.out.println(parsing[k]);
                    }
                }
            }
        }

    }

}
