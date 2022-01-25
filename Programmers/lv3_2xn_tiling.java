// 프로그래머스 lv3_2xn_타일링

package Programmers;

public class lv3_2xn_tiling {
    public static void main(String[] args) {
        int n = 4;
        Solution_2xn_tiling t = new Solution_2xn_tiling();
        System.out.println(t.solution(n));
    }
}

class Solution_2xn_tiling {
    public int solution(int n) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return b;
    }
}