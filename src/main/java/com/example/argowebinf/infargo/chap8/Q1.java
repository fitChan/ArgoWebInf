package com.example.argowebinf.infargo.chap8;

import java.util.Scanner;

public class Q1 {
    static int n;
    static boolean stop;
    static String answer ="NO";
    static int[] arr;
    static int total=0;
    public static void solution(int l, int sum , int[] arr){
        if(stop){
            return;
        }
        if(sum*2>total){
            return;
        }
        if(l==n){
            if(total-sum == sum){
                answer = "YES";
                stop = true;
            }
        }else{
            solution(l+1, sum + arr[l], arr);
            solution(l+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
           total += arr[i];
        }
        solution(0, 0, arr);
        System.out.println(answer);

    }
}
