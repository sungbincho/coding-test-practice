// 프로그래머스 lv1_모의고사

package Programmers;

import java.util.ArrayList;

public class lv1_Mock_test {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        Solution_mock_test mt = new Solution_mock_test();
        int[] result_array = mt.solution(answers);
        for(int i : result_array)
            System.out.println(i);
    }
}

class Solution_mock_test {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == p1[i % p1.length])
                count[0]++;
            if(answers[i] == p2[i % p2.length])
                count[1]++;
            if(answers[i] == p3[i % p3.length])
                count[2]++;
        }

        int max = Math.max(Math.max(count[0], count[1]), count[2]);

        ArrayList<Integer> al = new ArrayList<>();
        if (max == count[0])
            al.add(1);
        if (max == count[1])
            al.add(2);
        if (max == count[2])
            al.add(3);

        int[] answer = new int[al.size()];

        for(int i =0; i<answer.length; i++)
            answer[i] = al.get(i);

        return answer;
    }
}