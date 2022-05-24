package com.example.argowebinf.infargo.chap2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    //answer를 담을 arrayList
    static ArrayList<Integer> answer = new ArrayList();
    //prime Num을 판변하는 함수
    public static void prime(int num){
        if(num == 2){
            answer.add(num);
            return;
        }

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return;
            }
        }
        answer.add(num);
    }

    //숫자를 뒤집은 함수
    public static void solution(int num) {
        String str="";
        while(num>0){
            str += num%10;
            num = num/10;
        }
        int strToNum = Integer.parseInt(str);
        //prime으로 넘김.
        if(strToNum>1) {
            prime(strToNum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int[] arr = new int[tc];

        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < tc; i++) {
            if (arr[i] > 1) {
                solution(arr[i]);
            }
        }

        for(int x:answer){
            System.out.print(x+" ");
        }
    }
}
