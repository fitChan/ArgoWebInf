package com.example.argowebinf.infargo.chap6;

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
    public static int count(int[] arr, int cap) {
        int cnt = 1;
        int sum = 0;

        for(int x : arr){
            if(sum+x > cap){
                sum = x;
                cnt++;
            }else{
                sum += x;
            }
        }
        return cnt;
    }

    public static int solution(int n, int key, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) <= key) {
                answer = mid;
                rt = mid-1;
            }else{
                lt = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = solution(n, key, arr);
        System.out.println(answer);
    }
}
