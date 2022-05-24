package com.example.argowebinf.infargo.chap4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Q5 {
    public static int solution(int num , int key, int[] arr){
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){
                for(int k=j+1; k<num; k++){
                    set.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt = 0;
        for(int x: set){
            cnt++;
            if(cnt == key){
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int key = sc.nextInt();

        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int answer = solution(num, key, arr);

        System.out.println(answer);

    }
}
