// 프로그래머스 lv1_나누어 떨어지는_숫자_배열

package Programmers;

import java.util.*;

public class lv1_Dividing_numbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6};
        int divisor = 10;
        Solution_dividing_numbers dn = new Solution_dividing_numbers();
        int[] resultArray = dn.solution(arr, divisor);
        System.out.println(Arrays.toString(resultArray));
    }
}

class Solution_dividing_numbers {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[1];
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 0;

        for(int i : arr){
            if ((i % divisor) == 0) {
                al.add(i);
                count++;
            }
        }
        if (count == 0)
            answer[0] = -1;
        else if(count != 0){
            answer = new int[al.size()];
            for(int i = 0; i<al.size(); i++)
                answer[i] = al.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}