// 프로그래머스 lv2_큰_수_만들기

package Programmers;

public class lv2_Make_bigger_number {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        Solution_make_bigger_number mbn = new Solution_make_bigger_number();
        System.out.println(mbn.solution(number, k));
    }
}

class Solution_make_bigger_number {
    public String solution(String number, int k) {
        int idx = 0;
        char max;
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < number.length() - k; i++) {
            max = '0';
            for(int j = idx; j <= k + i; j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}