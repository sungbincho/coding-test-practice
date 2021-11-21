// 프로그래머스 lv1_예산

package Programmers;

import java.util.*;

public class lv1_budget {
    public static void main(String[] args) {
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        Solution_budget b = new Solution_budget();
        System.out.println(b.solution(d, budget));
    }
}

class Solution_budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for(int i = d.length-1; i>=0; i--){
            for(int j = 0; j<=i; j++){
                sum += d[j];
                answer++;
            }
            if(sum <= budget)
                return answer;
            else {
                sum = 0;
                answer = 0;
            }
        }
        return answer;
    }
}