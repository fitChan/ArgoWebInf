package com.example.argowebinf.infargo.chap4;

import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    public static String solution(int num, String str) {
        String answer = "";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char x: str.toCharArray()){
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char x: hashMap.keySet()){
            if(hashMap.get(x)>max){
                max = hashMap.get(x);
                answer = String.valueOf(x);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();

        String answer = solution(num, str);

        System.out.println(answer);
    }
}
