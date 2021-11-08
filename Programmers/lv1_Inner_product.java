// 프로그래머스 lv1_내적

package Programmers;

public class lv1_Inner_product {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        Solution_inner_product ip= new Solution_inner_product();
        System.out.println(ip.solution(a, b));
    }
}
class Solution_inner_product {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i<a.length; i++)
            answer += a[i]*b[i];
        return answer;
    }
}
