// 프로그래머스 lv2_예상_대진표

package Programmers;

public class lv2_List_of_matches {
    public static void main(String[] args) {
        int n = 9;
        int a = 4;
        int b = 7;
        Solution_list_of_matches lom = new Solution_list_of_matches();
        System.out.println(lom.solution(n, a, b));
    }
}

class Solution_list_of_matches {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(a != b){
            answer++;
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }
        return answer;
    }
}