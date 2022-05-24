package com.example.argowebinf.infargo.chap6;

import java.util.Scanner;

public class Q4 {
    public static int[] solution(int index, int n, int[] arr) {
        int[] c = new int[index];

        for (int i = 0; i < n; i++) {
            int idx = -1;
            for (int j = 0; j < index; j++) {
                if (arr[i] == c[j]) {
                    idx = j;
                }
            }
            if(idx == -1){
                for(int j=index-1; j>0; j--){
                    c[j] = c[j-1];
                }
                c[0] = arr[i];
            }else{
                for(int j=idx; j>0; j--){
                    c[j] = c[j-1];
                }
                c[0] = arr[i];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for(int x:solution(index, n, arr)){
            System.out.print(x+" ");

        }
    }
}
