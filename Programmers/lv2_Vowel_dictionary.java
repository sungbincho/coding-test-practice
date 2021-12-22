// 프로그래머스 lv2_모음사전

package Programmers;

public class lv2_Vowel_dictionary {
    public static void main(String[] args) {
        String word = "EIO";
        Solution_vowel_dictionary vd = new Solution_vowel_dictionary();
        System.out.println(vd.solution(word));
    }
}

class Solution_vowel_dictionary {
    public int solution(String word) {
        int answer = 0;
        int total = 3905;
        String aeiou = "AEIOU";

        for(String str: word.split("")){
            total /= 5;
            answer += total * aeiou.indexOf(str) + 1;
        }

        return answer;
    }
}