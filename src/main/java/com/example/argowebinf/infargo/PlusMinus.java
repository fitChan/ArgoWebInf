package com.example.argowebinf.infargo;

import java.util.LinkedList;
import java.util.Queue;

class Sum{
    int num, sum, index;

    public Sum(int num, int sum, int index) {
        this.index = index;
        this.num = num;
        this.sum = sum;
    }
}

public class PlusMinus {
    static int[] next = {1, -1};
    public static int solution(int[] numbers) {
        int l = numbers.length;
        int answer = 0;
        Queue<Sum> q  = new LinkedList<>();
        int index = 0;
        q.add(new Sum(numbers[index], 0, index));

        while(!q.isEmpty()){
            Sum temp = q.poll();
            int nowIndex = temp.index+1;
            if(nowIndex == l){
                for(int i=0; i< next.length; i++){
                    int dx = temp.num * next[i];
                    int numSum = dx+temp.sum;
                    if(numSum == 0){
                        answer++;
                    }
                }
            }else {
                for (int i = 0; i < next.length; i++) {
                    int dx = temp.num * next[i];
                    int nowSum = dx + temp.sum;
                    q.add(new Sum(numbers[nowIndex], nowSum, nowIndex));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1};
        System.out.println(solution(numbers));
    }
}
