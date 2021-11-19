// 프로그래머스 lv1_두_개_뽑아서_더하기

package Programmers;

import java.util.*;

public class lv1_Two_numbers_sum {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        Solution_two_num_sum tns = new Solution_two_num_sum();
        int[] resultArray = tns.solution(numbers);
        for(int i : resultArray)
            System.out.println(i);
    }
}

class Solution_two_num_sum {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<Integer>();

        for(int i = 0; i<numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++)
                set.add(numbers[i] + numbers[j]);
        }
        int[] answer = new int[set.size()];

        int index = 0;
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            answer[index] = (int)iter.next();
            index++;
        }
        return answer;
    }
}