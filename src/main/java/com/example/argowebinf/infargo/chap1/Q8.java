package com.example.argowebinf.infargo.chap1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {
    public static boolean solution(String str){
        ArrayList<String> arr = new ArrayList<>();
        String lowStr = str.toLowerCase();
        for(int i=0; i<lowStr.length(); i++){
            if(Character.isAlphabetic(lowStr.charAt(i))){
                arr.add(String.valueOf(lowStr.charAt(i)));
            }
        }
        String reverseArrToString;
        String arrToString ="";
        for(int i=0; i<arr.size(); i++){
            arrToString += arr.get(i);
        }
        reverseArrToString = new StringBuilder(arrToString).reverse().toString();

        if(reverseArrToString.equals(arrToString)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(solution(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
