// 프로그래머스 lv3_네트워크

package Programmers;

public class lv3_Network {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        Solution_network nw = new Solution_network();
        System.out.println(nw.solution(n, computers));
    }
}

class Solution_network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(computers, i, check);
                answer++;
            }
        }

        return answer;
    }

    public boolean[] dfs(int[][] computers, int i, boolean[] check) {
        check[i] = true;

        for (int j = 0; j < computers.length; j++)
            if (i != j && computers[i][j] == 1 && check[j] == false)
                check = dfs(computers, j, check);

        return check;
    }
}