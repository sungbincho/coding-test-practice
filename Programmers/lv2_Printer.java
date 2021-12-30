// 프로그래머스 lv2_프린터

package Programmers;

import java.util.*;

public class lv2_Printer {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        Solution_printer p = new Solution_printer();
        System.out.println(p.solution(priorities, location));
    }
}

class Solution_printer {
    static class Pair {
        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Pair> queue = new LinkedList<>();
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Pair(i, priorities[i]));
        }

        while (!queue.isEmpty()) {
            int current = queue.peek().value;
            boolean flag = false;

            for (Pair pair : queue) {
                if (pair.value > current) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                Pair temp = queue.poll();
                queue.add(temp);
            }
            else {
                answer++;
                Pair pair = queue.poll();

                if (pair.index == location)
                    return answer;
            }
        }
        return answer;
    }
}
