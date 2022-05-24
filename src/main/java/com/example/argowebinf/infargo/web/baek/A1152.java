package com.example.argowebinf.infargo.web.baek;

import java.util.Scanner;
import java.util.StringTokenizer;

public class A1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int cnt = st.countTokens();
        System.out.println(cnt);
    }
}
