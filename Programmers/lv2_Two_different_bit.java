// 프로그래머스 lv2_2개_이하로_다른_비트

package Programmers;

import java.util.*;

public class lv2_Two_different_bit {
    public static void main(String[] args) {
        long[] numbers = {2, 7};
        Solution_two_different_bit tdb = new Solution_two_different_bit();
        System.out.println(Arrays.toString(tdb.solution(numbers)));
    }
}

class Solution_two_different_bit {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0)
                answer[i] = numbers[i] + 1;
            else {
                String s = Long.toString(numbers[i], 2);
                int zeroIdx = s.lastIndexOf("0");
                if(zeroIdx != -1) {
                    s = s.substring(0, zeroIdx) + "10" + s.substring(zeroIdx + 2, s.length());
                    answer[i] = Long.parseLong(s, 2);
                } else {
                    s = "10" + s.substring(1, s.length());
                    answer[i] = Long.parseLong(s, 2);
                }
            }
        }
        return answer;
    }
}