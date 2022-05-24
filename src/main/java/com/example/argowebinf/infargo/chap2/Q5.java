package com.example.argowebinf.infargo.chap2;

import java.util.Scanner;

public class Q5 {
    static boolean[] prime;
    public static void solution(int num) {
        prime = new boolean[num+1];

        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int num = sc.nextInt();

        solution(num);

        for(int i=0; i< prime.length; i++){
            if(!prime[i]){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
