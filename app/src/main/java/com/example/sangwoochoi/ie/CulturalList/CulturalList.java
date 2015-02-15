package com.example.sangwoochoi.ie.CulturalList;

import java.util.ArrayList;

/**
 * Created by SangwooChoi on 2015-02-15.
 */
public class CulturalList {

    private ArrayList<String> culturalList = new ArrayList<String>();

    private String studentID = "";

    public CulturalList(String studentID){

        if(studentID == "08" || studentID == "2008"){
            this.studentID = "08";
        }
        else if(studentID == "09" || studentID == "2009" ){
            this.studentID = "09";
        }
        else if(studentID == "10" || studentID == "2010" ){
            this.studentID = "10";
        }
        else if(studentID == "11" || studentID == "2011" ){
            this.studentID = "11";
        }
        else if(studentID == "12" || studentID == "2012" ){
            this.studentID = "12";
        }
        else if(studentID == "13" || studentID == "2013" ){
            this.studentID = "13";
        }
        else{
            this.studentID = "14";
        }

        if( this.studentID == "08"){

            this.culturalList.add("대학국어");
            this.culturalList.add("통계학");
            this.culturalList.add("통계학 실험");
            this.culturalList.add("통년과학 1");
            this.culturalList.add("통년과학 1 실험");
            this.culturalList.add("통년과학 2");
            this.culturalList.add("통년과학 2 실험");
            this.culturalList.add("수및연1(또는 고급수학1)");
            this.culturalList.add("수및연2(또는 고급수학2)");
            this.culturalList.add("공학수학1");
            this.culturalList.add("공학수학2");
            this.culturalList.add("공학소양1");
            this.culturalList.add("공학소양2");
            this.culturalList.add("과기글");
            this.culturalList.add("컴퓨터의 원리/기초");
            this.culturalList.add("핵심교양 - 역사와 철학");
            this.culturalList.add("핵심교양 - 사회와 이념");
            this.culturalList.add("핵심교양 - 문학과 예술");
            this.culturalList.add("ⓔ 세 과목");
            this.culturalList.add("각자 Teps 점수에 맞는 영어강의");

        }

        else if( this.studentID == "09"){

            this.culturalList.add("대학국어");
            this.culturalList.add("통계학");
            this.culturalList.add("통계학 실험");
            this.culturalList.add("통년과학 1");
            this.culturalList.add("통년과학 1 실험");
            this.culturalList.add("통년과학 2");
            this.culturalList.add("통년과학 2 실험");
            this.culturalList.add("수및연1(또는 고급수학1)");
            this.culturalList.add("수및연2(또는 고급수학2)");
            this.culturalList.add("공학수학1");
            this.culturalList.add("공학수학2");
            this.culturalList.add("공학소양1");
            this.culturalList.add("공학소양2");
            this.culturalList.add("과기글");
            this.culturalList.add("컴퓨터의 원리/기초");
            this.culturalList.add("핵심교양 - 역사와 철학");
            this.culturalList.add("핵심교양 - 사회와 이념");
            this.culturalList.add("핵심교양 - 문학과 예술");
            this.culturalList.add("ⓔ 세 과목");
            this.culturalList.add("각자 Teps 점수에 맞는 영어강의");
        }

        else if( this.studentID == "10"){

            this.culturalList.add("대학국어");
            this.culturalList.add("통계학");
            this.culturalList.add("통계학 실험");
            this.culturalList.add("통년과학 1");
            this.culturalList.add("통년과학 1 실험");
            this.culturalList.add("통년과학 2");
            this.culturalList.add("통년과학 2 실험");
            this.culturalList.add("수및연1(또는 고급수학1)");
            this.culturalList.add("수및연2(또는 고급수학2)");
            this.culturalList.add("공학수학1");
            this.culturalList.add("공학수학2");
            this.culturalList.add("공학소양1");
            this.culturalList.add("공학소양2");
            this.culturalList.add("과기글");
            this.culturalList.add("컴퓨터의 원리/기초");
            this.culturalList.add("핵심교양 - 역사와 철학");
            this.culturalList.add("핵심교양 - 사회와 이념");
            this.culturalList.add("핵심교양 - 문학과 예술");
            this.culturalList.add("ⓔ 세 과목");
            this.culturalList.add("각자 Teps 점수에 맞는 영어강의");
        }

        else if( this.studentID == "11"){

            this.culturalList.add("대학국어");
            this.culturalList.add("통계학");
            this.culturalList.add("통계학 실험");
            this.culturalList.add("통년과학 1");
            this.culturalList.add("통년과학 1 실험");
            this.culturalList.add("통년과학 2");
            this.culturalList.add("통년과학 2 실험");
            this.culturalList.add("수및연1(또는 고급수학1)");
            this.culturalList.add("수및연2(또는 고급수학2)");
            this.culturalList.add("공학수학1");
            this.culturalList.add("공학수학2");
            this.culturalList.add("공학소양1");
            this.culturalList.add("공학소양2");
            this.culturalList.add("과기글");
            this.culturalList.add("컴퓨터의 원리/기초");
            this.culturalList.add("핵심교양 - 역사와 철학");
            this.culturalList.add("핵심교양 - 사회와 이념");
            this.culturalList.add("핵심교양 - 문학과 예술");
            this.culturalList.add("ⓔ 세 과목");
            this.culturalList.add("각자 Teps 점수에 맞는 영어강의");
        }

        else if( this.studentID == "12"){

            this.culturalList.add("대학국어");
            this.culturalList.add("통계학");
            this.culturalList.add("통계학 실험");
            this.culturalList.add("통년과학 1");
            this.culturalList.add("통년과학 1 실험");
            this.culturalList.add("통년과학 2");
            this.culturalList.add("통년과학 2 실험");
            this.culturalList.add("수및연1(또는 고급수학1)");
            this.culturalList.add("수및연2(또는 고급수학2)");
            this.culturalList.add("공학수학1");
            this.culturalList.add("공학수학2");
            this.culturalList.add("공학소양1");
            this.culturalList.add("공학소양2");
            this.culturalList.add("과기글");
            this.culturalList.add("컴퓨터의 원리/기초");
            this.culturalList.add("핵심교양 - 역사와 철학");
            this.culturalList.add("핵심교양 - 사회와 이념");
            this.culturalList.add("핵심교양 - 문학과 예술");
            this.culturalList.add("ⓔ 세 과목");
            this.culturalList.add("각자 Teps 점수에 맞는 영어강의");
        }

        else if( this.studentID == "13"){

            this.culturalList.add("대학국어");
            this.culturalList.add("통계학");
            this.culturalList.add("통계학 실험");
            this.culturalList.add("통년과학 1");
            this.culturalList.add("통년과학 1 실험");
            this.culturalList.add("통년과학 2");
            this.culturalList.add("통년과학 2 실험");
            this.culturalList.add("수및연1(또는 고급수학1)");
            this.culturalList.add("수및연2(또는 고급수학2)");
            this.culturalList.add("공학수학1");
            this.culturalList.add("공학수학2");
            this.culturalList.add("공학소양1");
            this.culturalList.add("공학소양2");
            this.culturalList.add("과기글");
            this.culturalList.add("컴퓨터의 원리/기초");
            this.culturalList.add("핵심교양 - 역사와 철학");
            this.culturalList.add("핵심교양 - 사회와 이념");
            this.culturalList.add("핵심교양 - 문학과 예술");
            this.culturalList.add("ⓔ 세 과목");
            this.culturalList.add("각자 Teps 점수에 맞는 영어강의");
        }

        else if( this.studentID == "14"){

            this.culturalList.add("대학국어");
            this.culturalList.add("통계학");
            this.culturalList.add("통계학 실험");
            this.culturalList.add("통년과학 1");
            this.culturalList.add("통년과학 1 실험");
            this.culturalList.add("통년과학 2");
            this.culturalList.add("통년과학 2 실험");
            this.culturalList.add("수및연1(또는 고급수학1)");
            this.culturalList.add("수및연2(또는 고급수학2)");
            this.culturalList.add("공학수학1");
            this.culturalList.add("공학수학2");
            this.culturalList.add("공학소양1");
            this.culturalList.add("공학소양2");
            this.culturalList.add("과기글");
            this.culturalList.add("컴퓨터의 원리/기초");
            this.culturalList.add("핵심교양 - 역사와 철학");
            this.culturalList.add("핵심교양 - 사회와 이념");
            this.culturalList.add("핵심교양 - 문학과 예술");
            this.culturalList.add("ⓔ 세 과목");
            this.culturalList.add("각자 Teps 점수에 맞는 영어강의");
        }
    }

    public ArrayList getCulturalList(){ return culturalList;}

}
