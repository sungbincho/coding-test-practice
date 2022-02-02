// 프로그래머스 lv3_N으로_표현

package Programmers;

public class lv3_N_representation {
    public static void main(String[] args) {
        int N = 5;
        int number = 12;
        Solution_n_representation n = new Solution_n_representation();
        System.out.println(n.solution(N, number));
    }
}

class Solution_n_representation {
    public int answer = -1;

    public int solution(int N, int number) {
        dfs(N, number, 0, 0);
        return answer;
    }

    public void dfs(int n, int num, int cnt, int val) {
        if (cnt > 8)
            return;

        if (num == val) {
            if (answer > cnt || answer == -1)
                answer = cnt;
            return;
        }

        int nn = 0;
        for (int i = 0; i < 8; i++) {
            nn = nn * 10 + n;
            dfs(n, num, cnt + 1 + i, val + nn);
            dfs(n, num, cnt + 1 + i, val - nn);
            dfs(n, num, cnt + 1 + i, val * nn);
            dfs(n, num, cnt + 1 + i, val / nn);
        }
    }
}