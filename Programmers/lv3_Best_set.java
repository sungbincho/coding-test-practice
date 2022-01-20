// 프로그래머스 lv3_최고의_집합

package Programmers;

import java.util.Arrays;

public class lv3_Best_set {
    public static void main(String[] args) {
        int n = 2;
        int s = 9;
        Solution_best_set bs = new Solution_best_set();
        System.out.println(Arrays.toString(bs.solution(n, s)));
    }
}

class Solution_best_set {
    public int[] solution(int n, int s) {
        int quotient = s/n;
        int remainder = s%n;
        if(quotient == 0)
            return new int[]{-1};

        int[] answer = new int[n];
        for(int i = answer.length-1; i >= 0;i--){
            answer[i] = quotient;
            if(remainder > 0){
                answer[i]++;
                remainder--;
            }
        }
        return answer;
    }
}