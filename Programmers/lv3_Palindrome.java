// 프로그래머스 lv3_가장_긴_팰린드롬

package Programmers;

public class lv3_Palindrome {
    public static void main(String[] args) {
        String s = "abcdcba";
        Solution_palindrome p = new Solution_palindrome();
        System.out.println(p.solution(s));
    }
}

class Solution_palindrome {
    public int solution(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j + i <= s.length(); j++) {
                boolean isPalindrome = true;
                for (int k = 0; k < i / 2; k++) {
                    if (s.charAt(j + k) != s.charAt(j + i - k - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome)
                    return i;
            }
        }
        return 1;
    }
}
