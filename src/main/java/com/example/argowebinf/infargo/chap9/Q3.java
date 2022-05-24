package com.example.argowebinf.infargo.chap9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Guest implements Comparable<Guest> {
    int n;
    char c;

    public Guest(int n, char c) {
        this.n = n;
        this.c = c;
    }

    @Override
    public int compareTo(Guest o) {
        if (this.n == o.n) {
            return o.c - this.c;
        } else {
            return this.n - o.n;
        }
    }
}

public class Q3 {
    public static int solution(ArrayList<Guest> arr) {
        int cnt = 0;
        int max = 0;
        for(Guest g : arr){
            if(g.c == 'a'){
                cnt++;
            }else{
                cnt --;
            }
            max = Math.max(max, cnt);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Guest> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Guest(x, 'a'));
            arr.add(new Guest(y, 'z'));
        }
        Collections.sort(arr);
        System.out.println(solution(arr));

    }
}
