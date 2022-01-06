// 프로그래머스 lv2_영어_끝말잇기

package Programmers;

import java.util.*;

public class lv2_Word_chain {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        Solution_word_chain wc = new Solution_word_chain();
        int[] resultArr = wc.solution(n, words);
        for(int i : resultArr)
            System.out.println(i);
    }
}

class Solution_word_chain {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        boolean flag = true;

        for(int i=0; i<words.length; i++){
            if(list.contains(words[i])){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }

            list.add(words[i]);

            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
        }
        return
                flag == true ? new int[]{0, 0} : answer;
    }
}