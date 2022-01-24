// 프로그래머스 lv3_거스름돈

package Programmers;

public class lv3_Change {
    public static void main(String[] args) {
        int n = 5;
        int[] money = {1, 2, 5};
        Solution_change c = new Solution_change();
        System.out.println(c.solution(n, money));
    }
}

class Solution_change {
    public int solution(int n, int[] money) {
        int[] answer = new int[100001];
        answer[0] = 1;

        for (int i : money)
            for (int j = i; j <= n; j++)
                answer[j] += answer[j - i];

        return answer[n];
    }
}