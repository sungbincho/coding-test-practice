// 프로그래머스 lv1_3진법_뒤집기

package Programmers;

import java.util.*;

public class lv1_Three_numeral_system {
    public static void main(String[] args) {
        int n = 45;
        Solution_three_numeral_system ns = new Solution_three_numeral_system();
        System.out.println(ns.solution(n));
    }
}
class Solution_three_numeral_system {
    public int solution(int n) {
        int answer = 0;
        int mod = 0;
        int quotient = -1;
        ArrayList<Integer> al = new ArrayList<Integer>();

        while(true){
            quotient = n/3;
            mod = n%3;

            if(quotient == 0){
                al.add(mod);
                break;
            }
            if(quotient != 0)
                al.add(mod);

            n = quotient;
        }

        int arrayListSize = al.size();
        for(int i : al){
            answer += (i * Math.pow(3, (arrayListSize -1)));
            arrayListSize--;
        }
        return answer;
    }
}