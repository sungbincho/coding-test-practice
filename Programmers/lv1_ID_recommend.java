// 프로그래머스 lv1_신규_아이디_추천

package Programmers;

public class lv1_ID_recommend {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        Solution_ID solution_id = new Solution_ID();
        System.out.println(solution_id.Solution_ID(new_id));
    }
}

class Solution_ID{
    public String Solution_ID(String new_id) {
        String answer = new_id.toLowerCase(); // 1단계
        answer = answer.replaceAll("[^a-z\\d\\-_.]*", ""); // 2단계
        answer = answer.replaceAll("\\.{2,}", "."); // 3단계
        answer = answer.replaceAll("^[.]|[.]$", ""); // 4단계

        if (answer.equals(""))  // 5단계
            answer = "a";

        if (answer.length() >= 16) // 6단계
            answer = answer.substring(0, 15);
        answer = answer.replaceAll("[.]$", "");

        // 7단계
        StringBuilder str = new StringBuilder(answer);
        if (str.length() <= 2) {
            char last = str.charAt(str.length() - 1);

            while (str.length() < 3) {
                str.append(last);
            }
        }
        answer = String.valueOf(str);

        return answer;
    }
}