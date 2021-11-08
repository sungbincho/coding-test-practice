// 프로그래머스 lv1_없는_숫자_더하기

package Programmers;

import java.util.Arrays;

public class lv1_Non_existent_numbers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        Solution_numbers sn = new Solution_numbers();
        System.out.println(sn.solution(numbers));
    }
}

class Solution_numbers {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] numCheck = new boolean[10];
        Arrays.fill(numCheck, true);

        for(int i : numbers)
            numCheck[i] = false;

        for(int j = 0; j< numCheck.length; j++){
            if(numCheck[j])
                answer += j;
        }
        return answer;
    }
}