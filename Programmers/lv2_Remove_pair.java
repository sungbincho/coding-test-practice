// 프로그래머스 lv2_짝지어_제거하기

package Programmers;

import java.util.Stack;

public class lv2_Remove_pair {
    public static void main(String[] args) {
        String s = "baabaa";
        Solution_remove_pair rp = new Solution_remove_pair();
        System.out.println(rp.solution(s));
    }
}

class Solution_remove_pair {
    public int solution(String s)     {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}