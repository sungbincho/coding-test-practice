// 프로그래머스 lv1_실패율

package Programmers;

import java.util.*;

public class lv1_Failure_rate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        Solution_failure_rate fr = new Solution_failure_rate();
        int[] resultArray = fr.solution(N, stages);
        for(int i : resultArray)
            System.out.println(i);
    }
}

class Solution_failure_rate {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> hm = new HashMap<Integer, Double>();
        for(int i = 1; i<=N; i++){
            double failureRate = 0;
            int personCount = 0;
            int sameStageCount = 0;
            for(int j : stages) {
                if (i <= j){
                    personCount++;
                    if (i == j)
                        sameStageCount++;
                }
            }

            if (sameStageCount == 0)
                failureRate = 0;
            else if (sameStageCount != 0)
                failureRate = (double)sameStageCount / (double)personCount;
            hm.put(i, failureRate);
        }

        for(Double l : hm.values())
            System.out.println(l);

        int[] answer = new int[hm.size()];

        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;

            for (int key : hm.keySet()) {
                if (max < hm.get(key)) {
                    max = hm.get(key);
                    maxKey = key;
                }
            }

            answer[i] = maxKey;
            hm.remove(maxKey);
        }
        return answer;
    }
}