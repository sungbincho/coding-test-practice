package Programmers;

public class lv1_Middle_string {
    public static void main(String[] args) {
        String s = "abcde";
        Solution_middle_string ms = new Solution_middle_string();
        System.out.println(ms.solution(s));
    }
}
class Solution_middle_string {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 1)
            answer += s.charAt(s.length()/2);
        else if(s.length() % 2 == 0){
            answer += s.charAt(s.length()/2-1);
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}