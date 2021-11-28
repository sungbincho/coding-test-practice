// 프로그래머스 lv1_문자열_내_마음대로_정렬하기

package Programmers;

import java.util.*;

public class lv1_String_random_sort {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        Solution_string_random_sort rs = new Solution_string_random_sort();
        String[] resultArr = rs.solution(strings, n);
        for(String str : resultArr)
            System.out.print(str + " ");
    }
}

class Solution_string_random_sort {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> strAl = new ArrayList<>();

        for(int i = 0; i<strings.length; i++)
            strAl.add(strings[i].charAt(n) + strings[i]);

        Collections.sort(strAl);

        for(int i = 0; i<strAl.size(); i++)
            answer[i] = strAl.get(i).substring(1);

        return answer;
    }
}
