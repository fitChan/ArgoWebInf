package com.example.argowebinf.infargo.web.programmers;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class RowColumnSpin {
    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] board = new int[rows + 1][columns + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                board[i][j] = (i - 1) * columns + (j);
            }
        }
        int answerIndex = 0;
        //기준 정하기
        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];
            int xCnt = x2 - x1;
            int yCnt = y2 - y1;
            Point x1y1 = new Point(x1, y1);
            Point x1y2 = new Point(x1, y2);
            Point x2y1 = new Point(x2, y1);
            Point x2y2 = new Point(x2, y2);
            int temp = board[x1][y1];
            min = temp;
            for (int j = 0; j < xCnt; j++) {
                x1++;
                board[x1 - 1][x1y1.y] = board[x1][x1y1.y];
                min = Math.min(min, board[x1][x1y1.y]);
            }
            for (int j = 0; j < yCnt; j++) {
                y1++;
                board[x2y1.x][y1 - 1] = board[x2y1.x][y1];
                min = Math.min(min, board[x2y1.x][y1]);
            }
            for (int j = 0; j < xCnt; j++) {
                x2--;
                board[x2 + 1][x2y2.y] = board[x2][x2y2.y];
                min = Math.min(min, board[x2][x2y2.y]);
            }
            for (int j = 0; j < yCnt; j++) {
                y2--;
                board[x1y2.x][y2 + 1] = board[x1y2.x][y2];
                min = Math.min(min, board[x1y2.x][y2]);
            }
            board[x1y1.x][x1y1.y + 1] = temp;
            answer[answerIndex++] = min;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(3, 3, new int[][]{{1, 1, 2, 2}, // (2,5), (2,4),(5,2),(5,4)
                                                                {1, 2, 2, 3},
                                                                {2, 1, 3, 2},
                                                                {2, 2, 3, 3}});
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
