// 프로그래머스 lv1_모의고사

package Programmers;

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
        int[] answer;
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

        int maxCount = 0;
        for(int i = 0; i < 3; i++){
            if(count[i] == max)
                maxCount++;
        }

        answer = new int[maxCount];
        for(int i=0; i<3; i++){
            if(count[i] == max)
                answer[i] = i + 1;
        }

        return answer;
    }
}