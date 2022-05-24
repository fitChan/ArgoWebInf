package com.example.argowebinf.infargo.web.baek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A10809 {
    static HashMap<Character, Integer> m;
    public static void solution(String str){
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        char[] ch  = str.toCharArray();

        for(int i=0; i<ch.length; i++){
            int temp = str.indexOf(ch[i]);
            m.replace(ch[i], temp);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = new HashMap<>();

        for(char i='a'; i<='z'; i++){
            m.put(i, -1);
        }
        String str = sc.nextLine();

        solution(str);

        for(int e : m.values()){
            System.out.print(e+" ");
        }
    }
}
