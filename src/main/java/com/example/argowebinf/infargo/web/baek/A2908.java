package com.example.argowebinf.infargo.web.baek;

import java.util.Scanner;

public class A2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String aR = new StringBuilder(a).reverse().toString();
        String bR = new StringBuilder(b).reverse().toString();
        int answer = Math.max(Integer.parseInt(bR), Integer.parseInt(aR));

        System.out.println(answer);
    }
}
