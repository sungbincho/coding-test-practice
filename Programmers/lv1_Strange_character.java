// 프로그래머스 lv1_이상한_문자_만들기

package Programmers;

public class lv1_Strange_character {
    public static void main(String[] args) {
        String s = "try hello world";
        Solution_strange_character sc = new Solution_strange_character();
        System.out.println(sc.solution(s));
    }
}

class Solution_strange_character {
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split("");

        int count = 0;
        for(String str : strArray) {
            count = str.contains(" ") ? 0 : count + 1;
            answer += count%2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
}
