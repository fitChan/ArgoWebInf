package com.example.argowebinf.infargo.chap8;

import java.util.Scanner;

public class Q13 {
    static int n;
    static int[][] land;
    static int[] dx = {-1, 0, 1, 0, 1, -1, 1, -1};
    static int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};
    static int answer = 0;

    public static void dfs(int x, int y, int[][] land){
        for(int i=0; i<8; i++){
            int nx = x+dx[i];
            int ny = y+ dy[i];
            if(nx >=0 && nx <n && ny >=0 && ny<n && land[nx][ny] == 1){
                land[nx][ny] = 0;
                dfs(nx, ny, land);
            }
        }
    }

    public static void solution(int[][] land){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(land[i][j] == 1){
                    land[i][j] = 0;
                    answer++;
                    dfs(i,j,land);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        land = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                land[i][j] = sc.nextInt();
            }
        }
        solution(land);
        System.out.println(answer);
    }
}
