package com.example.argowebinf.infargo.chap4;

import java.util.HashMap;
import java.util.Scanner;

public class Q2 {
    public static String solution(String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (char x : map1.keySet()) {
            if (!map1.get(x).equals(map2.get(x))) {
                return "NO";
            }
        }

        return "YES";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String answer = solution(str1, str2);

        System.out.println(answer);
    }
}
