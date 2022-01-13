// 프로그래머스 lv2_조이스틱

package Programmers;

public class lv2_Joy_stick {
    public static void main(String[] args) {
        String name = "JEROEN";
        Solution_joy_stick js = new Solution_joy_stick();
        System.out.println(js.solution(name));
    }
}

class Solution_joy_stick {
    public int solution(String name) {
        int answer = 0;
        char[] names = name.toCharArray();
        int minMove = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            if ((int) names[i] != 65) {
                int next = i + 1;
                while (next < name.length() && (int) names[next] == 65) {
                    next++;
                }
                int move = 2 * i + name.length() - next;
                minMove = Math.min(move, minMove);
            }
        }
        answer += minMove;

        for (int i = 0; i < name.length(); i++) {
            int front = Math.abs((int) names[i] - 65);
            int back = Math.abs((int) names[i] - 90) + 1;
            answer += Math.min(front, back);
        }

        return answer;
    }
}