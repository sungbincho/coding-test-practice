// 프로그래머스 lv1_정수_내림차순으로_배치하기

package Programmers;

import java.util.*;

public class lv1_Integer_desOrder {
    public static void main(String[] args) {
        long n = 118372;
        Solution_integer_desOrder id = new Solution_integer_desOrder();
        System.out.println(id.solution(n));
    }
}
class Solution_integer_desOrder {
    public long solution(long n) {
        String strNum = String.valueOf(n);
        StringBuilder s = new StringBuilder();
        char [] charArr = strNum.toCharArray();

        Arrays.sort(charArr);

        for (int i = charArr.length-1; i >= 0; i--)
            s.append(charArr[i]);

        long answer = Long.parseLong(s.toString());
        return answer;
    }
}