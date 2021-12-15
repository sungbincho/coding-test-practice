// 프로그래머스 lv2_구명보트

package Programmers;

import java.util.*;

public class lv2_Lifeboat {
    public static void main(String[] args) {
        int[] people =  {70, 50, 80, 50};
        int limit = 100;
        Solution_lifeboat lb = new Solution_lifeboat();
        System.out.println(lb.solution(people, limit));
    }
}

class Solution_lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int i = 0;

        Arrays.sort(people);

        for(int j=people.length-1; i<=j; j--) {
            if(people[j] + people[i] > limit)
                answer ++;
            else {
                answer ++;
                i ++;
            }
        }
        return answer;
    }
}