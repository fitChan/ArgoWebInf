package com.example.argowebinf.infargo.chap5;

import java.util.Scanner;
import java.util.Stack;

public class Q5 {
    public static int solution(String laser){
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<laser.length()-1; i++){
            if(laser.charAt(i) == '('){
                if(laser.charAt(i+1) == '('){
                    stack.push(laser.charAt(i));
                }else if(laser.charAt(i+1) == ')'){
                    answer += stack.size();
                }
            }else if(laser.charAt(i) == ')' && laser.charAt(i-1) == ')'){
                stack.pop();
                answer ++;
            }
        }

        return answer+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String laser = sc.next();

        int answer = solution(laser);
        System.out.println(answer);
    }
}
