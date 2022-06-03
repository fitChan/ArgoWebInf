package com.example.argowebinf.infargo.web.programmers;

import java.util.HashMap;

public class Joystick {
    public static int solution(String name) {
        int answer = 0;
        int len = name.length();
        //for 문에서 쓰일 i의 길이를 정해줄 int 값
        int min = len - 1;
        // min 값 정해주고 .

        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            //charAt(i)번째를 정해줌
            int move = Math.min(c - 'A', 'Z' - c + 1);
            //move = 현재 문자 - A 와 Z - 현재 문자 +1 중 작은 것을 선택
            answer += move;

            int nextIndex = i + 1;
            while (nextIndex < len && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }

            min = Math.min(min, (i * 2) + len - nextIndex);
        }
        answer += min;

        return answer;
    }

    public static void main(String[] args) {
        String name = "JAZ";
        int answer = solution(name);

        System.out.println(answer);
    }
}
