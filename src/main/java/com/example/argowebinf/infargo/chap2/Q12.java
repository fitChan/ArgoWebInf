package com.example.argowebinf.infargo.chap2;

import java.util.Scanner;

public class Q12 {
    public static int solution(int student, int testCase, int[][] arr) {
        int answer = 0;




        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int student = sc.nextInt();
        int testCase = sc.nextInt();

        int[][] arr = new int[testCase][student];
        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < student; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int answer = solution(student, testCase, arr);
        System.out.println(answer);
    }
}
