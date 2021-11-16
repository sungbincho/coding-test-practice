// 프로그래머스 lv1_두_정수_사이의_합

package Programmers;

public class lv1_Between_two_integers {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Solution_two_integers ti = new Solution_two_integers();
        System.out.println(ti.solution(a, b));
    }
}

class Solution_two_integers {
    public long solution(int a, int b) {
        long answer = 0;
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++)
                answer += i;
        return answer;
    }
}