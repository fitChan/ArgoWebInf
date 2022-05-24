package com.example.argowebinf.infargo.chap9;

import java.util.Scanner;

public class Q6 {
    static int[] index;
    public static int find(int v){
        if(v == index[v]){
            return v;
        }else{
            return index[v] = find(index[v]);
        }
    }
    public static void solution(int a, int  b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) {
            index[fa] = fb;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 인원
        int m = sc.nextInt(); // 간선 갯수
        index = new int[n+1];
        for(int i=1; i<=n; i++){
            index[i] = i;
        }
        for(int i=0; i<m ;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            solution(a, b);
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = find(a);
        int fb = find(b);

        if(fa == fb){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
