package com.example.argowebinf.infargo.chap8;

import java.util.ArrayList;
import java.util.Scanner;

class Adress {
    int x, y;

    public Adress(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q15 {
    static int n, m;
    static ArrayList<Adress> pizza = new ArrayList<>();
    static ArrayList<Adress> home = new ArrayList<>();
    static int[] combi;
    static int answer = Integer.MAX_VALUE;

    public static void solution() {
        int sum = 0;
        for (Adress h : home) {
            int distance = Integer.MAX_VALUE;
            for (int i : combi) {
                distance = Math.min(distance, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
            }
            sum += distance;
        }
        answer = Math.min(answer, sum);
    }

    public static void combi(int l, int s) {
        if (l == m) {
            solution();

        } else {
            for (int i = s; i < pizza.size(); i++) {
                combi[l] = i;
                combi(l + 1, i + 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                if (temp== 1) {
                    home.add(new Adress(i, j));
                } else if (temp == 2) {
                    pizza.add(new Adress(i, j));
                }
            }
        }

        combi(0, 0);
        System.out.println(answer);
    }
}
