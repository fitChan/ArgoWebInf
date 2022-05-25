package com.example.argowebinf.infargo.web.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


//아무리 중복 됬다 하더라도 같은 길이의 코스가 더 많이 주문이 되면 적게 주문된 코스는 빠진다. 중복될 시에 전부 추가한다.
public class MenuRenewalXX {
    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        for (String i : solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5})) {
            System.out.println(i);
        }

        //course 에 들어있는 int만 들어갈 수 있다. length로 걸러낼 것.

    }
}
