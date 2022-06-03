package com.example.argowebinf.infargo.web.programmers;

import java.util.Stack;

public class BracketRotation {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            try {
                switch (s.charAt(i)) {
                    case '[':
                        stack.add('[');
                        break;
                    case '(':
                        stack.add('(');
                        break;
                    case '{':
                        stack.add('{');
                        break;
                    case ']':
                        if (stack.peek() != '[') return false;
                        stack.pop();
                        break;
                    case '}':
                        if (stack.peek() != '{') return false;
                        stack.pop();
                        break;
                    case ')':
                        if (stack.peek() != '(') return false;
                        stack.pop();
                        break;
                }
            }catch (Exception e ){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static int solution(String s) {
        int answer = 0;

        String cloneS = s;
        for(int i=0; i<s.length(); i++){
            if(check(cloneS)) answer ++;

            cloneS = cloneS.substring(1,s.length()) + cloneS.charAt(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        String a = "[](){}";
        int b = solution(a);
        System.out.println(b);

    }

}
