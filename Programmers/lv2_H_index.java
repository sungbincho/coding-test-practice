// 프로그래머스 lv2_H_Index

package Programmers;

import java.util.*;

public class lv2_H_index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        Solution_h_index h = new Solution_h_index();
        System.out.println(h.solution(citations));
    }
}

class Solution_h_index {
    public int solution(int[] citations) {
        int answer = citations.length;
        Arrays.sort(citations);

        while(true){
            int cnt = 0;
            for(int i = citations.length - 1; i >= 0; i--)
                if(citations[i] >= answer)
                    cnt++;

            if(cnt >= answer)
                break;
            else
                answer--;
        }
        return answer;
    }
}
