package com.example.argowebinf.infargo.web.programmers;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Dis {
    int originX;
    int originY;
    int x;
    int y;


    public Dis(int originX, int originY, int x, int y) {
        this.originX = originX;
        this.originY = originY;
        this.x = x;
        this.y = y;

    }
}

public class SocialDistance {
    //각각의 대기실을 만드는 공장
    static String[][] board = new String[5][5];
    static Queue<Dis> q = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static String[][] classRoom(String[] board) {

        String[][] answer = new String[5][5];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                char[] ch = board[i].toCharArray();
                answer[i][j] = String.valueOf(ch[j]);
                if (answer[i][j].equals("P")) {
                    q.add(new Dis(i, j, i, j));
                    //P로 되어있는 모든 부분( x , y , sum )을 다 Dis 객체로 저장.
                }
            }
        }
        return answer;
    }

    public static int[] solution(String[][] places) {
        int[] answer = new int[5];
        Arrays.fill(answer, 1);
        //대기실을 각각 만들어 줘야함.
        for (int i = 0; i < places.length; i++) {
            board = classRoom(places[i]); //x열 하나를 넣었음.
            //하나 씩 메소드에 넣어 받은 answer 리턴값으로 여기 메소드 return 값에 넣어야함.
            //board로 들어왔어 .
            while (!q.isEmpty()) {
                Dis temp = q.poll();
                //하나 씩 뽑아서 찾을 생각 .  조건 1 ) distance가 3이될 때  또는  x를 만났을 때 저장 안해
                //                        조건 2 ) distance가 2이하인데 P를 만났을 경우 answer에 0을 저장하고 q를 비워버리고 끝
                //                          조건 3) distance 가 2 미만 일 때만 Q 에 추가 할거야.
                //                         특이사항 -> Check Visit 배열은 안쓸거야. 거리가 3이 되는 순간 뭘 하던 괜찮으니까
                /* TO DO
                 * 1.하나 씩 뽑은걸 dx dy 배열로 옮겨 가면서 x,y 값을 Dis 객체로 다시 q에 넣고 돌릴 것.
                 */
                for (int j = 0; j < dx.length; j++) {
                    int nx = temp.x + dx[j];
                    int ny = temp.y + dy[j];
                    if (nx < 0 || ny < 0 || nx > 4 || ny > 4 || board[nx][ny].equals("X") || (nx == temp.originX && ny == temp.originY)) continue; //원래 자리랑 겹치면 안되잖아. check visit 역할
                    int distance = Math.abs(nx-temp.originX) + Math.abs(ny - temp.originY); // 현재의 x 와 원래 x값(절댓값) + 현재의 y 와 원래의 y값(절대값) => 원래 거리와 3이 되면 P가 있던 말던 통과함
                    if (board[nx][ny].equals("P") && distance <= 2) { //P를 만났는데 2이하? 넌 뒈졌다.
                            answer[i] = 0;
                            q.clear();
                    } else if (board[nx][ny].equals("O") && distance < 2) { //O인데 2도 안됬다? 아직 무궁무진한 미래를 가진 Dis객체
                        q.add(new Dis(temp.originX, temp.originY, nx, ny)); //강해져서 돌아와라
                    }
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i : solution(new String[][]{{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                                                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                                                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                                                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                                                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}})) {
            System.out.print(i + " ");
        }
    }
}
