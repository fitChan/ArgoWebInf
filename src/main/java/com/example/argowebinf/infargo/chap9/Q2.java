package com.example.argowebinf.infargo.chap9;

import java.util.Arrays;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int x,y;

    public Time(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Time o) {
        if(this.y == o.y) {
            return this.x - o.x;
        }else{
            return this.y - o.y;
        }
    }
}
public class Q2 {
    public static int solution(Time[] arr){
        int cnt = 0;
        int nowTime = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i].x >= nowTime){
                cnt++;
                nowTime = arr[i].y;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Time[] arr = new Time[n];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Time(x,y);
        }
        Arrays.sort(arr);
        System.out.println(solution(arr));
    }
}
