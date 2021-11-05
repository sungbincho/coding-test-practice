// 프로그래머스 lv1_숫자_문자열과_영단어

package Programmers;

import java.util.HashMap;

public class lv1_numString_word {
    public static void main(String[] args) {
        String str = "one4seveneight";
        Solution_nsw solution = new Solution_nsw();
        System.out.println(solution.solution(str));
    }
}

class Solution_nsw {
    public int solution(String s) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("zero", 0);
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);
        hm.put("four", 4);
        hm.put("five", 5);
        hm.put("six", 6);
        hm.put("seven", 7);
        hm.put("eight", 8);
        hm.put("nine", 9);

        String temp = s;
        String tempStr = "";
        String answerString = "";

        for(int i = 0; i<temp.length(); i++){
            if(Character.isDigit(temp.charAt(i)))
                answerString += temp.charAt(i);
            else if(Character.isDigit(temp.charAt(i)) == false){
                tempStr += temp.charAt(i);
                if(hm.containsKey(tempStr)){
                    answerString += Integer.toString(hm.get(tempStr));
                    tempStr = "";
                }
                else
                    continue;
            }
        }
        int answer = Integer.parseInt(answerString);
        return answer;
    }
}