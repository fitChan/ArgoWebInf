package com.example.argowebinf.infargo.chap1;

import java.util.Scanner;

public class Q7 {
    public static boolean solution(String str) {

        String lowStr = str.toLowerCase();

        String reverseStr = new StringBuilder(lowStr).reverse().toString();

        if (lowStr.equals(reverseStr)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(solution(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
