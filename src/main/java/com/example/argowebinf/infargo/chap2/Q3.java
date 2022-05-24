package com.example.argowebinf.infargo.chap2;

import java.util.Scanner;

public class Q3 {
    public static void solution(int[] a, int[] b){
        String[] answer = new String[a.length];

        for(int i=0; i<a.length; i++){
            if(a[i]-b[i] == 1 ){
                answer[i] = "A";
            }else if(a[i]-b[i] == -1){
                answer[i] = "B";
            }else if(Math.abs(a[i]-b[i]) == 2){
                if(a[i] == 1){
                    answer[i] = "A";
                }else{
                    answer[i] = "B";
                }
            }else {
                answer[i] = "D";
            }
        }
        for(String x: answer){
            System.out.println(x);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] a = new int[tc];
        int[] b = new int[tc];

        for(int i=0; i<tc; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<tc; i++){
            b[i] = sc.nextInt();
        }

        solution(a,b);
    }
}
