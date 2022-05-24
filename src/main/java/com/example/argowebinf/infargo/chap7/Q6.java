package com.example.argowebinf.infargo.chap7;

public class Q6 {
    static int n;
    static int[] ch;
    public static void solution(int l){
        if(l == n+1){
            String answer = "";
            for(int i=1; i<=n; i++){
                if(ch[i] == 1){
                    answer+= i +" ";
                }
            }
            if(answer.length()>0){
                System.out.println(answer);
            }
        }else{
            ch[l] = 1;
            solution(l+1); //사용

            ch[l] = 0;
            solution(l+1);// 노사용
        }
    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n+1];
        solution(1);
    }
}
