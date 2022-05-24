package com.example.argowebinf.infargo.chap9;

import java.util.Arrays;
import java.util.Scanner;

class Player implements Comparable<Player>{
    public int h, w;
    public Player (int h, int w){
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Player player) {
        return player.h-this.h;
    }
}

public class Q1 {
    static boolean[] ch;
    public static void solution(Player[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i].w < arr[j].w && arr[i].h < arr[j].h){
                    ch[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Player[] arr = new Player[n];
        ch = new boolean[n];
        Arrays.fill(ch, true);
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
                arr[i] = new Player(h, w);

        }

        solution(arr);
        int answer = 0;
        for(boolean x : ch){
            if(x){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
