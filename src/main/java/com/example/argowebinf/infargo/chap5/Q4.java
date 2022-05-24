package com.example.argowebinf.infargo.chap5;

import java.util.Scanner;
import java.util.Stack;

public class Q4 {
    public static int solution(String str) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.split("")[i].equals("+") || str.split("")[i].equals("-") || str.split("")[i].equals("/") || str.split("")[i].equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                if (str.charAt(i) == '+') {
                    int sum = a+b;
                    stack.push(sum);
                } else if (str.charAt(i) == '-') {
                    int minus = b-a;
                    stack.push(minus);
                } else if (str.charAt(i) == '/') {
                    int divide = b/a;
                    stack.push(divide);
                } else {
                    int multi = b*a;
                    stack.push(multi);
                }
            } else {
                stack.push(Integer.valueOf(str.split("")[i]));
            }
        }
        answer += stack.pop();
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int answer = solution(str);

        System.out.println(answer);
    }
}
