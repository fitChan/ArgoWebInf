package com.example.argowebinf.infargo.chap1;

import java.util.Scanner;

public class Q11 {
    public static String solution(String str) {
        int num = 1;
        String answer = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                num++;
                if (i + 1 == str.length() - 1) {
                    answer += "" + str.charAt(i + 1) + num + "";
                }
            } else if (str.charAt(i) != str.charAt(i + 1)) {
                if (num == 1) {
                    answer += "" + str.charAt(i);
                } else {
                    answer += "" + str.charAt(i) + num + "";
                }
                num = 1;
                if (i + 1 == str.length() - 1) {
                    answer += "" + str.charAt(i + 1);
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }
}
