// 프로그래머스 lv1_문자열_내_p와_y의_개수

package Programmers;

public class lv1_Count_p_y {
    public static void main(String[] args) {
        String s = "pPoooyY";
        Solution_count_p_y pyCount = new Solution_count_p_y();
        boolean b = pyCount.solution(s);
        System.out.println(b);
    }
}
class Solution_count_p_y {
    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i<s.length(); i++){
            if ('p' == s.charAt(i) || 'P' == s.charAt(i))
                pCount++;
            else if ('y' == s.charAt(i) || 'Y' == s.charAt(i))
                yCount++;
        }
        if (0 == (pCount + yCount) || (pCount == yCount))
            answer = true;
        else if (pCount != yCount)
            answer = false;
        return answer;
    }
}
