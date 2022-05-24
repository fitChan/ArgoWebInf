package com.example.argowebinf.infargo.chap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q6 {
    public static int solution(int num, int sequence) {
        Queue<Integer> q = new LinkedList<>();
        int realSequence = sequence;
        for (int i = 1; i <= num; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            if (sequence == 1) {
                q.poll();
                sequence = realSequence;
            } else {
                int term = q.poll();
                q.add(term);
                sequence--;
            }
        }
        int answer = q.poll();

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sequence = sc.nextInt();

        int answer = solution(num, sequence);
        System.out.println(answer);
    }
}
