package com.example.argowebinf.infargo.chap1;

import java.util.Scanner;

public class Q12 {
    public static char BinaryToNumToWord (String str){
        int biNum = Integer.parseInt(str,2);

        char ch = (char) biNum;

        return ch;
    }
    public static char solution(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.split("")[i].equals("#")) {
                temp += 1;
            } else {
                temp += 0;
            }
        }
        char ch = BinaryToNumToWord(temp);

        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                answer += solution(str.substring(i * 7));
            } else {
                answer += solution(str.substring(i * 7, (i + 1) * 7));
            }
        }
        System.out.println(answer);
    }
}
