package com.example.argowebinf.infargo.chap8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tomato {
    int x, y;

    public Tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q12 {
    static int m, n;
    static int[][] box;
    static int[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Tomato> q = new LinkedList<>();

    public static void solution() {
        while (!q.isEmpty()) {
            Tomato t = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = t.x + dx[i];
                int ny = t.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
                    box[nx][ny] = 1;
                    q.offer(new Tomato(nx, ny));
                    dis[nx][ny] = dis[t.x][t.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();//세로칸(y값)
        n = sc.nextInt();//가로칸(x값)
        box = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) {
                    q.offer(new Tomato(i, j));
                }
            }
        }
        solution();

        boolean flag = true;

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    flag = false;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (box[i][j] != 0) {
                        answer = Math.max(answer, dis[i][j]);
                    }
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
