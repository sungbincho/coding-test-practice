// 프로그래머스 lv2_튜플

package Programmers;

import java.util.*;

public class lv2_Tuple {
    public static void main(String[] args) {
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        Solution_tuple t = new Solution_tuple();
        System.out.print(Arrays.toString(t.solution(s)));
    }
}

class Solution_tuple {
    public int[] solution(String s) {
        int[] answer = {};
        String [] strs = s.replaceAll("[{}]", " ").trim().split(" ,");
        answer = new int[strs.length];
        HashSet<Integer> hs = new HashSet<Integer>();

        Arrays.sort(strs, (a,b)->(a.length()-b.length()));

        int i = 0;
        for(String str : strs){
            for(String st : str.split(",")){
                int a  = Integer.parseInt(st.trim());
                if(hs.contains(a))
                    continue;
                hs.add(a);
                answer[i++] = a;
            }
        }
        return answer;
    }
}