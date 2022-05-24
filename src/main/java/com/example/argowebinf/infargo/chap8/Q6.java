package com.example.argowebinf.infargo.chap8;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    static int n, m;
    static Integer[] arr ;
    static int[] visited ;
    static int[] answer;

    public static void solution(int index) {
        if (index == m) {
            for (int x : answer) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if(visited[i] == 0) {
                    visited[i] = 1;
                    answer[index] = arr[i];
                    solution(index + 1);
                    visited[i] = 0;

                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new Integer[n];
        visited = new int[n];
        answer = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        solution(0);
    }
}
