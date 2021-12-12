// 프로그래머스 lv2_가장_큰_수

package Programmers;

import java.util.*;

public class lv2_Max_number {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        Solution_max_number mn = new Solution_max_number();
        System.out.println(mn.solution(numbers));
    }
}

class Solution_max_number {
    public String solution(int[] numbers) {
        String[] resultArr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++)
            resultArr[i] = String.valueOf(numbers[i]);

        Arrays.sort(resultArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }

        });

        if(resultArr[0].equals("0"))
            return "0";

        StringBuilder answer = new StringBuilder();

        for (String str : resultArr)
            answer.append(str);

        return answer.toString();
    }
}