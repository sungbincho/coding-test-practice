// 프로그래머스 lv3_입국심사

package Programmers;

import java.util.Arrays;

public class lv3_Immigration {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        Solution_immigration i = new Solution_immigration();
        System.out.println(i.solution(n, times));
    }
}

class Solution_immigration {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 1;
        long end = (long) times[times.length - 1] * n;
        Arrays.sort(times);

        while (start <= end) {
            long sum = 0;
            long mid = (start + end) / 2;

            for (int time : times)
                sum += mid / time;

            if (sum >= n) {
                end = mid - 1;
                answer = mid;
            } else
                start = mid + 1;
        }

        return answer;
    }
}