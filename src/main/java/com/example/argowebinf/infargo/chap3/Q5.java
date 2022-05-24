package com.example.argowebinf.infargo.chap3;

import java.util.Scanner;

public class Q5 {
    public static int solution(int num) {
        int answer = 0;
        int sum = 0;
        int index = 0;
        int arrSize=0;
        if(num%2 == 0){
            arrSize = num/2;
        }else {
            arrSize = num / 2 + 2;
        }
        int[] arr = new int[arrSize];

        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }



        for(int i=0; i<arr.length; i++){
            sum+= i;

            while(sum>num){
                sum-=arr[index];
                index++;
            }

            if(sum == num){
                answer++;
                sum-=arr[index];
                index++;
            }

            if(index == arr.length) {
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = solution(num);
        System.out.println(answer);
    }
}
