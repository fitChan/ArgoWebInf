package com.example.argowebinf.infargo.web.baek;

import java.util.ArrayList;
import java.util.Scanner;

public class A2675 {
    static ArrayList<String> strArr = new ArrayList<>();
    public static void solution(int num, String str){
        StringBuilder answer = new StringBuilder();
        char[] ch = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<num; j++){
                answer.append(ch[i]);
            }
        }
        strArr.add(answer.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for(int i=0; i<tc; i++){
            int num = sc.nextInt();
            String str = sc.next();
            solution(num, str);
        }
        for(String e: strArr){
            System.out.println(e);
        }
    }
}
