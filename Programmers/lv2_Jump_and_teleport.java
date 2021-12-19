// 프로그래머스 lv2_점프와_순간_이동

package Programmers;

public class lv2_Jump_and_teleport {
    public static void main(String[] args) {
        int n = 5000;
        Solution_jump_teleport jt = new Solution_jump_teleport();
        System.out.println(jt.solution(n));
    }
}

class Solution_jump_teleport {
    public int solution(int n) {
        int answer = 0;

        while(n != 0){
            if(n%2 == 0)
                n = n/2;
            else {
                n = n-1;
                answer++;
            }
        }
        return answer;
    }
}

/* 이진수로 표현하여 구할 수 있음

class Solution_jump_teleport {
    public int solution(int n) {
        String binaryCode = Integer.toBinaryString(distance);
        String[] arr = binaryCode.split("");
        int count=0;

        for(int i=0; i<arr.length; i++)
            if (arr[i].equals("1"))
                count++;

        return count;
    }
}
*/