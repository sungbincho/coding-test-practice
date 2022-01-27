// 프로그래머스 lv3_정수_삼각형

package Programmers;

public class lv3_Integer_triangle {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        Solution_integer_triangle it = new Solution_integer_triangle();
        System.out.println(it.solution(triangle));
    }
}

class Solution_integer_triangle {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];
        int answer = 0;

        dp[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0)
                    dp[i][j] = dp[i - 1][0] + triangle[i][j];
                else if (j == triangle[i].length - 1)
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                else
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
            }
        }

        for (int i = 0; i < triangle.length; i++)
            answer = Math.max(answer, dp[triangle.length - 1][i]);

        return answer;
    }
}