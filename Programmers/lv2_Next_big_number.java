// 프로그래머스 lv2_다음_큰_숫자

package Programmers;

public class lv2_Next_big_number {
    public static void main(String[] args) {
        int n = 15;
        Solution_next_big_number nbn = new Solution_next_big_number();
        System.out.println(nbn.solution(n));
    }
}

class Solution_next_big_number {
    public static int countOne(int num){
        int count = 0;
        String binaryString = Integer.toBinaryString(num);
        for(int i = 0; i<binaryString.length(); i++)
            if(binaryString.charAt(i) == '1')
                count++;
        return count;
    }

    public int solution(int n) {
        int answer = n+1;
        while(true){
            if(countOne(answer) == countOne(n))
                break;
            answer++;
        }
        return answer;
    }
}