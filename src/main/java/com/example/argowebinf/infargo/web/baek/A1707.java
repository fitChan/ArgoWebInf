package com.example.argowebinf.infargo.web.baek;

import java.util.ArrayList;
import java.util.Scanner;

class Graph {
    int x, y;

    public Graph(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class A1707 {

    public static void solution(ArrayList arr) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        ArrayList<Graph> graphs = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            int v = sc.nextInt(); // 정점
            int e = sc.nextInt(); // 간선
            for(int j=0; j<e; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                Graph graph = new Graph(x,y);
                graphs.add(graph);
                solution(graphs);
            }
        }
    }
}
