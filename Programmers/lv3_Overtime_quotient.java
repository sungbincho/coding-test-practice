// 프로그래머스 lv3_야근_지수

package Programmers;

import java.util.*;

public class lv3_Overtime_quotient {
    public static void main(String[] args) {
        int n = 4;
        int[] works = {4, 3, 3};
        Solution_overtime_quotient oq = new Solution_overtime_quotient();
        System.out.println(oq.solution(n, works));
    }
}

class Solution_overtime_quotient {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < works.length; i++)
            q.offer(works[i]);

        while (n > 0) {
            int work = q.poll();
            if (work == 0)
                break;
            work -= 1;
            q.offer(work);
            n -= 1;
        }

        long answer = 0;
        for (int work : q)
            answer += work * work;

        return answer;
    }
}