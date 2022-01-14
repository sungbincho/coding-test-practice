// 프로그래머스 lv2_기능개발

package Programmers;

import java.util.*;

public class lv2_Function_develop {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        Solution_function_develop fd = new Solution_function_develop();
        System.out.println(Arrays.toString(fd.solution(progresses, speeds)));
    }
}

class Solution_function_develop {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = progresses.length - 1; i >= 0; i--)
            stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));

        while (!stack.isEmpty()) {
            int cnt = 1;
            int top = stack.pop();

            while (!stack.isEmpty() && stack.peek() <= top) {
                cnt++;
                stack.pop();
            }
            list.add(cnt);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }
}