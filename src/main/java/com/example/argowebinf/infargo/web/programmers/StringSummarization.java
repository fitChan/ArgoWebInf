package com.example.argowebinf.infargo.web.programmers;

public class StringSummarization {
    public static int solution(String s) {
        int answer = s.length();

        if (s.length() == 1) return 1;

        for (int i = 1; i <= s.length() / 2; i++) { //1 ~ 4
            String str = "";
            //now
            String temp = "";
            //비교 대상
            int cnt = 1;

            for (int j = 0; j < s.length() / i; j++) { // i=1 일때 j = 0->7 , i= 2일때  j = 0->3; , i=3 일때 j = 0->1;
                String substring = s.substring(i * j, (j * i) + i);
                if (temp.equals(substring)) {
                    cnt++;
                    continue;
                }
                //이제 다른 문자열일 경우일 때 넘어옴.
                if (cnt > 1) {
                    str += cnt + temp;
                    cnt = 1; //cnt 초기화
                } else {
                    // 그전에 같은 문자열이 없어서 cnt ==1 이면 그냥 temp 를 붙여버림.
                    str += temp;
                }
                temp = substring;
            }

            if (cnt > 1) { //이게 왜 필요하냐? 위에서 같을경우 str에 추가 안하고 cnt만 ++ 해서 j가 끝나면 여기로 와서 더해줘야함 str에 .
                str += cnt + temp;
                cnt = 1;  // 다음 i를 위해 초기화 .
            }else{
                str += temp;
            }

            if(s.length()/i != 0){
                str+= s.substring(s.length()-s.length()%i);
            }
            answer = Math.min(answer, str.length());
        }

        return answer;
    }

    public static void main(String[] args) {

        // 제일 짧은 것을 찾는다.
        //char array? 2씩 끊어 내는것 부터 시작?

        String s = "aabbaccc"; //length = 8; length/2 = 4;
        solution(s);
        System.out.println();
    }

}
