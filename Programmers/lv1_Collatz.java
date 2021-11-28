// 프로그래머스 lv1_콜라츠_추측

package Programmers;

public class lv1_Collatz {
    public static void main(String[] args) {
        int num = 626331;
        Solution_collatz collatz = new Solution_collatz();
        System.out.println(collatz.solution(num));
    }
}

class Solution_collatz {
    public int solution(int num) {
        long longNum = (long)num; // 데이터 손실 방지하기 위한 형변환
        int count = 0;

        while (longNum != 1) {
            if (longNum % 2 == 0)
                longNum /= 2;
            else
                longNum = longNum * 3 + 1;

            count++;

            if (count > 500)
                return -1;
        }

        return count;
    }
}