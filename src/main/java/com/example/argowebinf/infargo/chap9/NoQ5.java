package com.example.argowebinf.infargo.chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> { //PQ사용시에 cost 작은 것부터 꺼내줘!
    int cost, vex;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.cost - edge.cost;
    }
}

public class NoQ5 {
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public static void solution(int v) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(v, 0));

        while (!pq.isEmpty()) {
            Edge temp = pq.poll();

            int now = temp.vex; //now 는 pq에서 뽑은 b값 (도달하는 정점)
            int nowCost = temp.cost; //nowCost 는 pq에서 뽑은 값 (여태까지의 값)(b값(도달하는 정점) 직전까지의 비용)

            if (nowCost > dis[now]) continue; //nowCost 자체가 현재 dis배열에 저장된 값보다 크면 끝.. 계산을 줄이자

            for (Edge e : graph.get(now)) {
                if (dis[e.vex] > nowCost + e.cost) { //dis에 저장된 최솟값(default = MaxValue) 보다 nowCost에다가 c값 더한것.
                    dis[e.vex] = nowCost + e.cost;
                    pq.add(new Edge(e.vex, dis[e.vex]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 수
        int m = sc.nextInt(); // 간선의 수
        dis = new int[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[1] = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();  //a 부터
            int b = sc.nextInt();  //b 까지
            int c = sc.nextInt();  //c의 비용
            graph.get(a).add(new Edge(b, c)); // a에서 b로 가는 c의 비용을 a라는 ArrayList<Edge>에 Edge 객체로 bc를 저장. 즉
            // a에서 가는 모든 비용을 한번에 볼수 있음. ex)) a가 1일때 > [2,3],[3,4] 1번에서 2번가는데 3cost 3가는데 4cost
        }
        solution(1);
        for (int i = 1; i < dis.length; i++) {
            if (dis[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : " + "impossible");
            } else {
                System.out.println(i + " : " + dis[i]);
            }
        }
    }
}
