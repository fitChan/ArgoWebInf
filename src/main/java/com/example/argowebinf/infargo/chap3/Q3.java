package com.example.argowebinf.infargo.chap3;

import java.util.Scanner;

public class Q3 {
    public static int solition(int n , int k, int[] arr){
        int answer = 0;
        int sum  =0;
        for(int i=0;i<k; i++){
            sum += arr[i];
            answer = sum;
        }

        for(int i=k; i<n; i++){
            sum+= arr[i]-arr[i-k];

            answer= Math.max(sum, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int answer = solition(n,k,arr);
        System.out.println(answer);
    }
}
