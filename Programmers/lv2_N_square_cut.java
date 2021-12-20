// 프로그래머스 lv2_n^2_배열_자르기

package Programmers;

public class lv2_N_square_cut {
    public static void main(String[] args) {
        int n = 4;
        long left = 7;
        long right = 14;
        Solution_n_square_cut nsc = new Solution_n_square_cut();
        int[] resultArr = nsc.solution(n, left, right);
        for(int i : resultArr)
            System.out.println(i);
    }
}

class Solution_n_square_cut {
    public int[] solution(int n, long left, long right) {
        int[] ret = new int[(int)(right-left)+1];
        int cnt = 0;
        while(left<=right) {
            int min = (int)(left/n)+1;
            ret[cnt++] = (int)Math.max(min, left%n+1);
            left++;
        }
        return ret;
    }
}