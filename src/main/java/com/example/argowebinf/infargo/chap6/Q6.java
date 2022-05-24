package com.example.argowebinf.infargo.chap6;

import java.util.Scanner;

public class Q6 {
    public static void solution(int n, int[] arr) {
        int[] tmp = new int[n];
        for(int i=0; i<n; i++){
            tmp[i] = arr[i];
        }
        int[] answer = new int[2];

        for (int i = 1; i < n; i++) {
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (tmp[i]-arr[i] != 0) {
                answer[index] = i+1;

                index++;
            }
        }
        for(int x: answer){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, arr);

    }
}
