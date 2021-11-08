// 프로그래머스 lv1_음양_더하기

package Programmers;

public class lv1_Signs_add {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        Solution_signs_add sa= new Solution_signs_add();
        System.out.println(sa.solution(absolutes, signs));
    }
}
class Solution_signs_add {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i =0; i<signs.length; i++){
            if(signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }
        return answer;
    }
}