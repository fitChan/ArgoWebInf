package com.example.argowebinf.infargo.chap5;

import java.util.Scanner;
import java.util.Stack;

public class Q2 {
    public static String solution(String str){
        StringBuilder answer = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '('){
                stack.push(c);
            }else if(stack.isEmpty()){
                answer.append(c);
            }else if(c == ')'){
                stack.pop();
            }

        }


        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

       String answer =  solution(str);
        System.out.println(answer);
    }
}
