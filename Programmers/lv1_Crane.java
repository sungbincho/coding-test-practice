// 프로그래머스 lv1_크레인_인형뽑기_게임

package Programmers;

import java.util.Stack;

public class lv1_Crane {
    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        Solution_crane solution = new Solution_crane();
        System.out.println(solution.solution(board, moves));
    }
}

class Solution_crane {
    Stack<Integer> doll_stack = new Stack<>();

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        for (int i = 0; i < moves.length; i++) {
            int line_index = moves[i] - 1;
            int temp = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][line_index] == 0)
                    continue;
                else if (board[j][line_index] != 0) {
                    temp = board[j][line_index];
                    board[j][line_index] = 0;
                    doll_stack.push(temp);
                    answer += twoDollCheck();
                    break;
                }
            }
        }
        return answer;
    }

    public int twoDollCheck() {
        if (doll_stack.size() < 2)
            return 0;
        else {
            int num_top = doll_stack.pop();
            int num_bottom = doll_stack.pop();
            if (num_top == num_bottom)
                return 2;
            else {
                doll_stack.push(num_bottom);
                doll_stack.push(num_top);
                return 0;
            }
        }
    }
}