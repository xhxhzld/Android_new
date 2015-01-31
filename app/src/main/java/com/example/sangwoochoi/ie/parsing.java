package com.example.sangwoochoi.ie;

/**
 * Created by junyoung kim on 2015-01-27.
 */
import android.util.Log;

import java.util.*;
import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

public class parsing {
    public static String[] SNUparsing() {
        String date_text = "";
        String context = "";
        String url = "";
        try {
            for (int i = 1; i < 4; i++) {
                String link = "http://ie.snu.ac.kr/index.php?mid=Notice&page=" + i;
                Document doc = Jsoup.connect(link).get();

                Elements date = doc.select("td[class=date]");

                for (Element k : date) {
                    date_text = date_text + "?" + k.select("td.date").text();

                }


                Elements span = doc.select("td[class=title]");

                for (Element e : span) {
                    context = context + "?" + e.select("td.title").text();

                }

                Elements href = doc.select("td.title > a[href]");

                for (Element e : href) {
                    url = url + ", " + e.attr("href");

                }

            }


        } catch (IOException ex) {
            System.err.println("Error:" + ex.getMessage());
        }
        String[] parsingText = new String[date_text.split("\\?").length - 1];
        for (int i = 1; i < date_text.split("\\?").length; i++) {
            parsingText[i - 1] = date_text.split("\\?")[i] + "\n" + context.split("\\?")[i] + ";" + url.split(", ")[i];
        }

        Log.i("ie", parsingText[0]);
        return parsingText;
    }

    public static String[] Dupli_Sort(String[] array) {
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


    public static ArrayList<String> selection(String[] parsing, String search, String search_sec) {
        ArrayList<String> selected = new ArrayList<String>();

        for (int k = 0; k < parsing.length - 1; k++) {
            if (parsing[k].contains(search) || parsing[k].contains(search_sec)) {
                selected.add(parsing[k].split(";")[0]);
            }
        }
        return selected;
    }


    public static ArrayList<String> selection_url(String[] parsing, String search, String search_sec) {
        ArrayList<String> selected = new ArrayList<String>();

        for (int k = 0; k < parsing.length - 1; k++) {
            if (parsing[k].contains(search) || parsing[k].contains(search_sec)) {
                selected.add(parsing[k].split(";")[1]);
            }
        }
        return selected;
    }

    public static String content(String url) {
        String content = "";
        try {
                String link = url;
                Document doc = Jsoup.connect(link).get();


            Elements context = doc.select("div[class=contentBody]");
        if(!context.contains("br")) {
            content = context.text().replace("\u00a0", "\n");


        }

        } catch (IOException ex) {
            System.err.println("Error:" + ex.getMessage());
        }

        return content;
    }
}