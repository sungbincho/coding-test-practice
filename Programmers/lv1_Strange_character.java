// 프로그래머스 lv1_이상한_문자_만들기

package Programmers;

public class lv1_Strange_character {
    public static void main(String[] args) {
        String s = "try  hello    world";
        Solution_strange_character sc = new Solution_strange_character();
        System.out.println(sc.solution(s));
    }
}

class Solution_strange_character {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s.replaceAll("\\s{2,}", " ");
        String[] strArray = s.split(" ");
        for (String str : strArray) {
            for (int i = 0; i < str.length(); i++) {
                answer.append(i%2 == 0 ? Character.toUpperCase(str.charAt(i)) : Character.toLowerCase(str.charAt(i)));
                if (i == str.length()-1 && strArray[strArray.length-1] != str)
                    answer.append(" ");
            }
        }
        return answer.toString();
    }
}

