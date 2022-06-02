package com.example.argowebinf.infargo.web.programmers;

import org.junit.Assert;
import org.junit.Test;

public class TileX2 {
    public static int solution(int n) {
        int answer = 1;

        int a = 1;
        int b = 1;

        for(int i=1; i<n ;i++){
            answer = (a+b) % 1000000007;

            a = b;
            b = answer;
        }
        return answer;
    }

    @Test
    public void 정답(){
        Assert.assertEquals(5, solution(4));
        Assert.assertEquals(55, solution(10));
        Assert.assertEquals(1, solution(1));
    }
}
