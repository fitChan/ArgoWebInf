package com.example.argowebinf.infargo.chap2;

import java.util.Scanner;

public class Q1 {
    public static String solution(int[] arr){
        String answer = "";
        answer += arr[0]+" ";

        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                answer+= arr[i]+" ";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int[] arr = new int[tc];

        for(int i=0;  i<tc; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
}
