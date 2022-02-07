// 프로그래머스 lv3_이중우선순위큐

package Programmers;

import java.util.*;

public class lv3_Two_priority_queue {
    public static void main(String[] args) {
        String[] operations = {"I 7", "I 5", "I -5", "D -1"};
        Solution_two_priority_queue tpq = new Solution_two_priority_queue();
        System.out.println(Arrays.toString(tpq.solution(operations)));
    }
}

class Solution_two_priority_queue {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> minQ = new PriorityQueue();
        PriorityQueue<Integer> maxQ = new PriorityQueue(Collections.reverseOrder());

        int val = 0;

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            String opType = op.substring(0, 1);

            if (opType.equals("D")) {
                if (op.charAt(2) == '-') {
                    if (!minQ.isEmpty()) {
                        val = minQ.peek();
                        minQ.poll();
                        maxQ.remove(val);
                    }
                } else {
                    if (!maxQ.isEmpty()) {
                        val = maxQ.peek();
                        maxQ.poll();
                        minQ.remove(val);
                    }
                }
            } else {
                int value = Integer.parseInt(op.substring(2));
                maxQ.offer(value);
                minQ.offer(value);
            }
        }

        if (!maxQ.isEmpty()) {
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }

        return answer;
    }
}