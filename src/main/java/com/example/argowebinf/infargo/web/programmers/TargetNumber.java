package com.example.argowebinf.infargo.web.programmers;

import java.util.LinkedList;
import java.util.Queue;

class Num {
    int sum;
    int index;

    public Num(int sum, int index) {
        this.sum = sum;
        this.index = index;
    }
}

public class TargetNumber {
    public static int solution(int[] numbers, int target) {
        int[] dx = {1, -1};
        int answer = 0;

        Queue<Num> q = new LinkedList<>();
        q.add(new Num(0, 0));

        while (!q.isEmpty()) {
            Num temp = q.poll();
            if (temp.index == numbers.length) {
                if(temp.sum == target){
                    answer++;
                }
            } else {
                for (int i = 0; i < dx.length; i++) {
                    int nowSum = temp.sum + numbers[temp.index]*dx[i];
                    q.add(new Num(nowSum, temp.index+1));
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 1, 2, 1}, 4));
    }
}
