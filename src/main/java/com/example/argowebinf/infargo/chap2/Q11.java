package com.example.argowebinf.infargo.chap2;

import java.util.Scanner;

public class Q11 {
    static int tc;
    static boolean[] checked;

    public static int solution(int[][] arr) {
        int answer= 0;
        int cnt = 0;
        int max = 0;

        for (int i = 0; i < tc; i++) {
            cnt = 0;
            for (int j = 0; j < tc; j++) {
                for (int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(max<cnt){
                max = cnt;
                answer = i+1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        tc = sc.nextInt();
        int[][] arr = new int[tc][5];
        for (int i = 0; i < tc; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr));
    }
}
