// 프로그래머스 lv2_124_나라의_숫자

package Programmers;

public class lv2_124 {
    public static void main(String[] args) {
        int n = 4;
        Solution_124 s = new Solution_124();
        System.out.println(s.solution(n));
    }
}

class Solution_124 {
    public static String solution(int n) {
        String[] num = {"4", "1", "2"};
        String answer = "";

        while (n > 0) {
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }

        return answer;
    }
}
