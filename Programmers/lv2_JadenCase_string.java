// 프로그래머스 lv2_JadenCase_문자열_만들기

package Programmers;

public class lv2_JadenCase_string {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        Solution_jadencase ja = new Solution_jadencase();
        System.out.println(ja.solution(s));
    }
}

class Solution_jadencase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String s1 = s.charAt(0) + "";
        answer.append(s1.toUpperCase());

        for (int i = 1; i < s.length(); i++) {
            String s2 = s.charAt(i) + "";
            if (s2.equals(' '))
                answer.append(" ");
            else if (s.charAt(i - 1) == ' ')
                answer.append(s2.toUpperCase());
            else
                answer.append(s2.toLowerCase());
        }

        return answer.toString();
    }
}