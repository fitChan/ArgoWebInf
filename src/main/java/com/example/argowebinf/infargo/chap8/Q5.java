package com.example.argowebinf.infargo.chap8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {
    static int n,m;
    static int min = Integer.MAX_VALUE;
    public static void solution(int sum, int cnt, Integer[] arr){
        if(sum>m){
            return;
        }
        if(cnt>=min){
            return;
        }
        if(sum == m){
            min = Math.min(min, cnt);
        }else{
            for(int i=0; i<n; i++){
                solution(sum+arr[i], cnt+1, arr);
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();  //동전의 개수
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();  //동전의 Value
        }
        Arrays.sort(arr, Collections.reverseOrder()); //수월한 계산을 하기 위해 큰수부터 넣어봄
        m = sc.nextInt();  //거슬러줄 돈
        solution(0, 0, arr);
        System.out.println(min);
    }
}
