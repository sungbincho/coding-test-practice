// 프로그래머스 lv3_단언_변환

package Programmers;

public class lv3_Word_conversion {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        Solution_word_conversion wc = new Solution_word_conversion();
        System.out.println(wc.solution(begin, target, words));
    }
}

class Solution_word_conversion {
    static boolean[] visited;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i])
                continue;

            int count = 0;
            for (int j = 0; j < begin.length(); j++)
                if (begin.charAt(j) == words[i].charAt(j))
                    count++;

            if (count == begin.length() - 1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}