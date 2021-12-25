// 프로그래머스 lv2_카펫

package Programmers;

public class lv2_Carpet {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        Solution_carpet sc = new Solution_carpet();
        int[] resultArr = sc.solution(brown, yellow);
        for(int i : resultArr)
            System.out.println(i);
    }
}

class Solution_carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown + yellow;

        for (int i = 1; i <= area; i++) {
            int row = i;
            int col = area / row;

            if (row > col)
                continue;

            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }
        return answer;
    }
}