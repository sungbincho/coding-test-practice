// 프로그래머스 lv2_이진_변환_반복하기

package Programmers;

public class lv2_Convert_binary_repetition {
    public static void main(String[] args) {
        String s = "110010101001";
        Solution_convert_binary cb = new Solution_convert_binary();
        int[] resultArr = cb.solution(s);
        for(int i : resultArr)
            System.out.println(i);
    }
}

class Solution_convert_binary {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(true){
            for(int i = 0; i<s.length(); i++)
                if(s.charAt(i) == '0')
                    answer[1]++;

            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
            answer[0]++;

            if(s.equals("1"))
                break;
        }
        return answer;
    }
}
