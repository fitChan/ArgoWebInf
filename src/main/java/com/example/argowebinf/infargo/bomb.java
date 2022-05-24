package com.example.argowebinf.infargo;

import java.util.LinkedList;
import java.util.Queue;


public class bomb {
    public static int solution(int n, int m, int k) {
        int answer = 0;
        int[] arr = new int[n + 1];
        arr[1] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while (!q.isEmpty()) {
            int temp = q.poll();
            if (arr[temp] % 2 == 0) {
                int now = temp - k;
                if (now <= 0) {
                    now = temp + (n - k);
                }
                answer++;
                arr[now] ++;
                if(arr[now] == m){
                    break;
                }
                q.add(now);
            } else {
                int now = temp + k;
                if (now > n) {
                    now = temp - (n - k);
                }
                answer++;
                arr[now] ++;
                if(arr[now] == m){
                    break;
                }
                q.add(now);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 3, 2));
    }
}
