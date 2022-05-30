package com.example.argowebinf.infargo.web.programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaxCalAbs {
    static char[] prior = {'+', '-', '*'};
    static boolean[] check = new boolean[3];

    static ArrayList<Long> nums = new ArrayList<>();
    static ArrayList<Character> option = new ArrayList<>();
    static long answer;

    public static long solution(String expression) {
        answer = 0;
        String num = "";

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                //숫자일 경우 num String 으로 하나하나 저장해서
                num += expression.charAt(i);
            } else {
                //부호를 만낫을 경우 저장하고 (Long) 털어낼 것.
                nums.add(Long.parseLong(num));
                num = "";
                //해당 부호는 option 어레이에 저장 .
                option.add(expression.charAt(i));
            }
        }
        nums.add(Long.parseLong(num));

        dfs(0, new char[3]);

        return answer;
    }

    public static void dfs(int count, char[] p) { //p.length  == 3, count(default) = 0;
        if (count == 3) {
            ArrayList<Long> cloneNums = new ArrayList<>(nums);
            ArrayList<Character> cloneOption = new ArrayList<>(option);
            //지금 복사 해서 사용함.
            for (int i = 0; i < p.length; i++) {
                for (int j = 0; j < cloneOption.size(); j++) {
                    if (p[i] == cloneOption.get(j)) {
                        Long res = calculate(cloneNums.remove(j), cloneNums.remove(j), p[i]);
                        cloneNums.add(j, res);
                        cloneOption.remove(j);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(cloneNums.get(0)));
        }
        for(int i=0; i<3; i++){
            if(!check[i]){
                check[i] = true;
                p[count] = prior[i];
                dfs(count+1, p
                );
                check[i] = false;
            }
        }

    }


    public static Long calculate(Long num1, Long num2, char option) {
        long num = 0;
        switch (option) {
            case '+': {
                return num1 + num2;
            }
            case '-': {
                return num1 - num2;
            }
            case '*': {
                return num1 * num2;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String b = "100-200*300-500+20";

        System.out.println(solution(b));
    }
}
