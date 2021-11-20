// 프로그래머스 lv1_2016년

package Programmers;

public class lv1_2016 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        Solution_2016 s = new Solution_2016();
        System.out.println(s.solution(a, b));
    }
}
class Solution_2016 {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int dayCount = 0;

        for(int i = 0; i < (a-1); i++)
            dayCount += month[i];
        dayCount += b-1;

        String answer = day[dayCount % 7];
        return answer;
    }
}