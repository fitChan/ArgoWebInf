package com.example.argowebinf.infargo.chap6;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static int cal(int mid, int c, int[] arr){
        int cnt = 1;
        int ep = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=mid){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public static int solution(int n , int c, int[] arr){
        int answer =0;
        int lt = 1;
        int rt = arr[n-1];
        while(lt<=rt){
            int mid = (lt+rt)/2;
            int cnt = cal(mid, c, arr);
            if(cnt>=c){
                answer = mid;
                lt = mid+1;
            }else{
                rt = mid-1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = solution(n, c ,arr);
        System.out.println(answer);
    }
}
