package com.example.argowebinf.infargo.chap1;

import java.util.Scanner;

public class Q2 {
    public static String solution(String word) {
        String answer = "";
        for (char x : word.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(solution(word));
    }
}
