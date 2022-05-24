package com.example.argowebinf.infargo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prac {
    public static int[] solution(int n, int[][] quests) {
        int[] answer = new int[n];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] now = new int[n+1];

        for(int i=0; i< quests.length; i++){
            graph.get(quests[i][0]).add(quests[i][1]);
            now[quests[i][1]]++;
        }

        for(int i=1; i<= n; i++){
            if(now[i] == 0){
                pq.add(i);
            }
        }
        int index = 0;
        while(!pq.isEmpty()) {
            int temp = pq.poll();
            answer[index++] = temp;
            ArrayList<Integer> arr = graph.get(temp);
            for (int i : arr) {
                now[i]--;
                if (now[i] == 0) {
                    pq.add(i);
                }
            }
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
        for(int i : solution(5, quest)){
            System.out.print(i+" ");
        };
    }
}
