// 프로그래머스 lv2_가장_큰_정사각형_찾기

package Programmers;

public class lv2_Biggest_square_search {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        Solution_biggest_square bs = new Solution_biggest_square();
        System.out.println(bs.solution(board));
    }
}

class Solution_biggest_square {
    public int solution(int [][]board) {
        int answer = 0;
        int height = board.length;
        int width = board[0].length;
        int[][] table = new int[height + 1][width + 1];

        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                table[i + 1][j + 1] = board[i][j];

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (table[i][j] != 0) {
                    table[i][j] = Math.min(Math.min(table[i - 1][j], table[i][j - 1]), table[i - 1][j - 1]) + 1;
                    answer = Math.max(answer, table[i][j]);
                }
            }
        }

        return answer * answer;
    }
}