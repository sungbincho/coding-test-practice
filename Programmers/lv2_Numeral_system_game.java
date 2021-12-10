// 프로그래머스 lv2_n진수_게임

package Programmers;

public class lv2_Numeral_system_game {
    public static void main(String[] args) {
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;

        Solution_numeral_system_game nsg = new Solution_numeral_system_game();
        System.out.println(nsg.solution(n, t, m, p));
    }
}

class Solution_numeral_system_game {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        int num = 0;

        while(sb.length() < m * t)
            sb.append(Integer.toString(num++, n));

        for(int i = p-1; i< m * t; i += m)
            answer.append(sb.charAt(i));

        return answer.toString().toUpperCase();
    }
}
