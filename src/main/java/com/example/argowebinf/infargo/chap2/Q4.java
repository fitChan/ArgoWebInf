package com.example.argowebinf.infargo.chap2;

import java.util.Scanner;

public class Q4 {
    public static String solution(int num){
        String answer = "";
        int[] arr = new int[num];

        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<num; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        for(int x: arr){
            answer+= x+" ";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        System.out.println(solution(num));
    }
}
