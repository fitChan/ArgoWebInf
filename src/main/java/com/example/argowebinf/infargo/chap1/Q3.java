package com.example.argowebinf.infargo.chap1;

import java.util.Scanner;

public class Q3 {
    public static String solution(String sentence) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] sentenceArr = sentence.split(" ");
        for(int i=0; i<sentenceArr.length; i++){
            int len   =  sentenceArr[i].length();
            if(len>max){
                max = len;
                answer = sentenceArr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        System.out.println(solution(sentence));
    }
}
