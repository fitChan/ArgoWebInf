package com.example.argowebinf.infargo.chap8;

import java.util.Scanner;

public class Q2 {
    static int max = 0;
    static int c;

    public static void solution(int sum, int l, int[] arr) {
        if (sum > c) {
            return;
        }
        if (l == arr.length) {
            max = Math.max(sum, max);
        } else {
            solution(sum, l + 1, arr);
            solution(sum + arr[l], l + 1, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        c = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solution(0, 0, arr);
        System.out.println(max);
    }
}
