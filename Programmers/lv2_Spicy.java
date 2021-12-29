// 프로그래머스 lv2_더_맵게

package Programmers;

import java.util.PriorityQueue;

public class lv2_Spicy {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        Solution_spicy s = new Solution_spicy();
        System.out.println(s.solution(scoville, k));
    }
}

class Solution_spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int i : scoville)
            heap.offer(i);

        while (heap.peek() <= K) {
            if (heap.size() == 1)
                return -1;

            int num1 = heap.poll();
            int num2 = heap.poll();

            int result = num1 + (num2 * 2);

            heap.offer(result);
            answer ++;
        }
        return answer;
    }
}