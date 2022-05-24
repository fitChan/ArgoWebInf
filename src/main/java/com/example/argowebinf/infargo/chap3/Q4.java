package com.example.argowebinf.infargo.chap3;

import java.util.Scanner;

public class Q4 {
    public static int solution(int tc, int key, int[] arr) {
        int answer = 0;
        int index = 0;
        int sum = 0;

        for (int i = 0; i < tc; i++) {
            sum += arr[i];

            while(sum > key) {
                sum -= arr[index];
                index++;
            }
            if (sum == key) {
                answer++;
                sum -= arr[index];
                index++;
            }

            if (index == arr.length) {
                return answer;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[tc];
        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = solution(tc, key, arr);
        System.out.println(answer);
    }
}
