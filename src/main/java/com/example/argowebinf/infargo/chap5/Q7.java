package com.example.argowebinf.infargo.chap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7 {
    public static String solution(String str, String exam) {
        StringBuilder answer = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<exam.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(exam.charAt(i) == str.charAt(j)){
                    q.add(exam.charAt(i));
                    break;
                }
            }
        }
        while(!q.isEmpty()){
            answer.append(q.poll());
        }

        if(answer.toString().equals(str)){
            return "YES";
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String exam = sc.next();

        String answer = solution(str, exam);
        System.out.println(answer);
    }
}
