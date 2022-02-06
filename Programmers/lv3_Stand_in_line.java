// 프로그래머스 lv3_줄_서는_방법

package Programmers;

import java.util.*;

public class lv3_Stand_in_line {
    public static void main(String[] args) {
        int n = 3;
        long k = 5;
        Solution_stand_in_line sil = new Solution_stand_in_line();
        System.out.println(Arrays.toString(sil.solution(n, k)));
    }
}

class Solution_stand_in_line {
    public int[] solution(int n, long k) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] result = new int[n];
        int fn = 1;
        for (int i = 1; i <= n; i++) {
            fn *= i;
            al.add(i);
        }
        k--;

        int idx = 0;
        while (n > 0) {
            fn /= n;
            result[idx++] = al.get((int) (k / fn));
            al.remove((int) k / fn);
            k %= fn;
            n--;
        }
        return result;
    }
}