package com.example.argowebinf.infargo.chap8;

import java.util.Scanner;

public class Q9 {
    static int n, f;
    static int[] ch = new int[n];

    public static void solution(int index, int[] arr, int x) {
        if (index == n) {
            for(int tmp : arr){
                System.out.print(tmp+" ");
            }
            System.out.println();
        } else {
            for (int i = x; i <= f; i++) {
                arr[index] = i;
                solution(index+1, arr, arr[index]+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        f = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        solution(0, arr, 1);
    }
}
