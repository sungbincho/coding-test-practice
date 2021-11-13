// 프로그래머스 lv1_같은_숫자는_싫어

package Programmers;

import java.util.*;

public class lv1_Same_number {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3, 3};
        Solution_same_number sn = new Solution_same_number();
        int[] result = sn.solution(arr);
        for(int i : result)
            System.out.println(i);
    }
}

class Solution_same_number {
    public int[] solution(int []arr) {
        ArrayList<Integer> answerArray = new ArrayList<Integer>();
        answerArray.add(arr[0]);

        for(int i = 1; i<arr.length; i++){
            if (arr[i] != arr[i - 1])
                answerArray.add(arr[i]);
        }
        int[] answer = new int[answerArray.size()];
        for(int i = 0; i<answerArray.size(); i++)
            answer[i] = answerArray.get(i);

        return answer;
    }
}