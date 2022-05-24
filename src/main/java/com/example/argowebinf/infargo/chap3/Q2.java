package com.example.argowebinf.infargo.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void solution(int[] fArr, int[] sArr) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(fArr);
        Arrays.sort(sArr);
        int fNum = 0;
        int sNum = 0;
        while (fNum < fArr.length && sNum < sArr.length) {
            if (fArr[fNum] == sArr[sNum]) {
                arr.add(fArr[fNum++]);
                sNum++;
            }else if(fArr[fNum] < sArr[sNum]){
                fNum++;
            }else {
                sNum++;
            }
        }

        for(int x: arr){
            System.out.print(x+" ");
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstTc = sc.nextInt();
        int[] firstArr = new int[firstTc];
        for (int i = 0; i < firstTc; i++) {
            firstArr[i] = sc.nextInt();
        }

        int secondTc = sc.nextInt();
        int[] secondArr = new int[secondTc];
        for (int i = 0; i < secondTc; i++) {
            secondArr[i] = sc.nextInt();
        }

        solution(firstArr, secondArr);
    }
}
