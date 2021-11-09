// 프로그래머스 lv1_완주하지_못한_선수

package Programmers;

import java.util.Arrays;

public class lv1_Finish_marathon {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "josipa", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        Solution_finish_marathon fm = new Solution_finish_marathon();
        System.out.println(fm.solution(participant, completion));
    }
}

class Solution_finish_marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }
        return answer;
    }
}
