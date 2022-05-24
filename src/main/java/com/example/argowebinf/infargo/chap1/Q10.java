package com.example.argowebinf.infargo.chap1;

import java.util.Scanner;

public class Q10 {
    public static String solution(String str, String key){
        int[] leftIndex = new int[str.length()];
        int[] rightIndex = new int[str.length()];
        String answer = "";
        for(int i=0; i<str.length(); i++){
            if(str.split("")[i].equals(key)){
                leftIndex[i] = 0;
                rightIndex[i] = 0;
            }else{
                leftIndex[i] = -1;
                rightIndex[i] = -1;
            }
        }
        int num = 10;
        for(int i=0; i<str.length(); i++){
            if(leftIndex[i] == -1){
                leftIndex[i] = num;
                num++;
            }else{
                num = 1;
            }
        }
        num =10;
        for(int i=str.length()-1; i>=0; i--){
            if(rightIndex[i] == -1){
                rightIndex[i] = num;
                num ++;
            }else{
                num =1;
            }
        }
        for(int i=0; i< leftIndex.length; i++){
            if(leftIndex[i]>rightIndex[i]){
                leftIndex[i] = rightIndex[i];
            }
        }
        for(int i=0; i< leftIndex.length; i++){
            answer += leftIndex[i]+" ";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        String key = sc.next();
        System.out.println(solution(str, key));
    }
}
