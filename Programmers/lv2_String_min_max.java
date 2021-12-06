package Programmers;

import java.util.Arrays;

public class lv2_String_min_max {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        Solution_string_min_max smm = new Solution_string_min_max();
        System.out.println(smm.solution(s));
    }
}
class Solution_string_min_max {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.split(" ");

        int[] numArr = new int[strArr.length];
        for(int i =0; i<numArr.length; i++)
            numArr[i] = Integer.parseInt(strArr[i]);

        Arrays.sort(numArr);

        answer.append(numArr[0] + " " + numArr[numArr.length-1]);

        return answer.toString();
    }
}