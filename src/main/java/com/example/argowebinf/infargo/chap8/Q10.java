package com.example.argowebinf.infargo.chap8;

import java.util.Scanner;

public class Q10 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] index = new int[8][8];
    static int answer = 0;
    public static void solution(int x, int y) {
        if(x == 7 && y == 7){
            answer++;
        }else{
            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx >=1  && nx <=7  &&ny >=1 && ny <=7 && index[nx][ny] == 0){
                    index[nx][ny] = 1;
                    solution(nx, ny);
                    index[nx][ny] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                index[i][j] = sc.nextInt();
            }
        }
        index[1][1] = 1;
        solution(1, 1);
        System.out.println(answer);
    }
}
