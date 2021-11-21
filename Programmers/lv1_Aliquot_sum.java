// 프로그래머스 lv1_약수의_합

package Programmers;

public class lv1_Aliquot_sum {
    public static void main(String[] args) {
        int n = 12;
        Solution_aliquot_sum as = new Solution_aliquot_sum();
        System.out.println(as.solution(n));
    }
}

class Solution_aliquot_sum {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n/2; i++){
            if(n%i == 0)
                answer += i;
        }
        return answer + n;
    }
}