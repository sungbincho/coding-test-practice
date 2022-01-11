// 프로그래머스 lv2_문자열_압축

package Programmers;

public class lv2_String_compression {
    public static void main(String[] args) {
        String s = "abcabcabcabcdededededede";
        Solution_string_compression sc = new Solution_string_compression();
        System.out.println(sc.solution(s));
    }
}

class Solution_string_compression {
    public int solution(String s) {
        int answer = s.length();

        for(int i = 1; i <= s.length() / 2; i++){
            int zipLevel = 1;
            String zipStr = s.substring(0, i);
            StringBuilder result = new StringBuilder();
            for(int j = i; j <= s.length(); j += i){
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
                if(zipStr.equals(next))
                    zipLevel++;
                else{
                    result.append((zipLevel != 1 ? zipLevel : "") + zipStr);
                    zipStr = next;
                    zipLevel = 1;
                }
            }
            result.append(zipStr);
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}