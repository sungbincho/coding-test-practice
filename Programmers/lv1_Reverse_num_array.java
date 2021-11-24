// 프로그래머스 lv1_자연수_뒤집어_배열로_만들기

package Programmers;

public class lv1_Reverse_num_array {
    public static void main(String[] args) {
        long n = 12345;
        Solution_reverse_numArray rn = new Solution_reverse_numArray();
        int[] resultArray = rn.solution(n);
        for(int i : resultArray)
            System.out.print(i);
    }
}
class Solution_reverse_numArray {
    public int[] solution(long n) {
        int lengthNum = Long.toString(n).length();
        int[] answer = new int[lengthNum];

        int count = 0;
        while(n != 0){
            answer[count] = (int)n%10;
            n /= 10;
            count++;
        }
        return answer;
    }
}