package com.example.argowebinf.infargo.chap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Person{
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Q8 {
    public static int solution(int n, int m, int[] arr) {
        int answer = 1;

        Queue<Person> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            q.offer(new Person(i, arr[i]));
        }
        while(!q.isEmpty()){
            Person temp = q.poll();

            for(Person x : q){
                if(x.priority>temp.priority){
                    q.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp!=null){
                if(temp.id == m)return answer;
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = solution(n, m, arr);
        System.out.println(answer);
    }
}
