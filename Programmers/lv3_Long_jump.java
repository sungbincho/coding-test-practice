// 프로그래머스 lv3_멀리_뛰기

package Programmers;

public class lv3_Long_jump {
    public static void main(String[] args) {
        int n = 4;
        Solution_long_jump lj = new Solution_long_jump();
        System.out.println(lj.solution(n));
    }
}

class Solution_long_jump {
    public long solution(int n) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < 2001; i++)
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;

        return dp[n];
    }
}