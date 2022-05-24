package com.example.argowebinf.infargo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class ZZZ {
    public static int[] solution(int n, int[][] quests) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            arr.add(new ArrayList<>());
        }
        int[] nowCnt = new int[n + 1];
        for (int i = 0; i < quests.length; i++) {
            arr.get(quests[i][0]).add(quests[i][1]);
            nowCnt[quests[i][1]]++;
        }
        int[] answer = new int[n];
        for (int i = 1; i < n + 1; i++) {
            if (nowCnt[i] == 0) pq.add(i);
        }
        int index = 0;
        while (!pq.isEmpty()) {
            int temp = pq.poll();
            answer[index] = temp;
            index++;
            ArrayList<Integer> list = arr.get(temp);
            for (int i : list) {
                nowCnt[i]--;
                if (nowCnt[i] == 0) {
                    pq.add(i);
                }
            }
        }
        for (int i : answer) {
            System.out.println(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] quest = {
                {1, 3},
                {1, 4},
                {3, 5},
                {5, 4}
        };
        solution(5, quest);
    }
}

