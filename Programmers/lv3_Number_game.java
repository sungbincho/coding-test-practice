// 프로그래머스 lv3_숫자_게임

package Programmers;

import java.util.Arrays;

public class lv3_Number_game {
    public static void main(String[] args) {
        int[] A = {5, 1, 3, 7};
        int[] B = {2, 2, 6, 8};
        Solution_number_game ng = new Solution_number_game();
        System.out.println(ng.solution(A, B));
    }
}

class Solution_number_game {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int aIdx = 0;
        int bIdx = 0;
        int answer = 0;
        while (aIdx != A.length && bIdx != B.length) {
            if (A[aIdx] < B[bIdx]) {
                answer++;
                aIdx++;
            }
            bIdx++;
        }
        return answer;
    }
}