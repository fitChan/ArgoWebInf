package com.example.argowebinf.infargo.chap8;

import java.util.Scanner;

public class Q7 {
    static int[][] index = new int[35][35];
    public static int solution(int n , int r){
        if(index[n][r] != 0){
            return index[n][r];
        }
        if(n == r || r == 0){
            return 1;
        }else{
            return index[n][r] = solution(n-1, r-1) + solution(n-1, r);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  r = sc.nextInt();

        System.out.println(solution(n,r));
    }
}
