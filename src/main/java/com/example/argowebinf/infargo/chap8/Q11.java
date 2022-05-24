package com.example.argowebinf.infargo.chap8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q11 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board = new int[8][8];
    static int[][] dis = new int[8][8];
    static boolean flag;
    public static void solution(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));

        while (!q.isEmpty()) {
            board[x][y]= 1;
            for (int i = 0; i < q.size(); i++) {
                Point point = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = point.x + dx[j];
                    int ny = point.y + dy[j];

                    if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny] == 0){
                        board[nx][ny]= 1;
                        q.add(new Point(nx, ny));
                        dis[nx][ny] = dis[point.x][point.y]+1;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        solution(1, 1);
        if(dis[7][7]  == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(dis[7][7]);
        }
    }
}
