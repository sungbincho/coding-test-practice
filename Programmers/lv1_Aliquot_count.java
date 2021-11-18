// 프로그래머스 lv1_약수의_개수와_덧셈

package Programmers;

public class lv1_Aliquot_count {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        Solution_aliquot_count ac = new Solution_aliquot_count();
        System.out.println(ac.solution(left, right));
    }
}
class Solution_aliquot_count {
    public int solution(int left, int right) {
        int answer = 0;
        int aliquotCount = 0;

        for(int i = left; i<=right; i++){
            for(int j = 1; j<=i; j++)
                if(i%j == 0)
                    aliquotCount++;

            if(aliquotCount%2 == 0)
                answer += i;
            if(aliquotCount%2 != 0)
                answer -= i;

            aliquotCount = 0;
        }

        return answer;
    }
}