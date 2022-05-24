package com.example.argowebinf.infargo.chap7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8 {
    static int sum = 0;
    static int[] dist = {1, -1, 5};
    public static int solution(int s, int e){
        Queue<Integer> q = new LinkedList<>();
        int[] index = new int[10001];
        index[s] = 1;
        q.offer(s);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int temp = q.poll();
                if(temp == e){
                    return sum;
                }
                for(int j=0; j<3; j++){
                    int nextTmp = temp+dist[j];

                    if(nextTmp>=1 && nextTmp<=10000 && index[nextTmp] == 0){
                        index[nextTmp] = 1;
                        q.offer(nextTmp);
                    }
                }
            }
            sum ++;
        }

        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(solution(s, e));
    }
}
