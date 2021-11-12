package Programmers;

public class lv1_sports_uniform {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        Solution_sports_uniform su = new Solution_sports_uniform();
        System.out.println(su.solution(n, lost, reserve));
    }
}

class Solution_sports_uniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] uniformCount = new int[n];

        for (int i : reserve)
            uniformCount[i - 1]++;

        for (int i : lost)
            uniformCount[i - 1]--;

        for (int i = 0; i < uniformCount.length; i++)
            if (uniformCount[i] < 0)
                if (i != uniformCount.length - 1 && uniformCount[i + 1] > 0) {
                    uniformCount[i]++;
                    uniformCount[i + 1]--;
                } else if (i != 0 && uniformCount[i - 1] > 0) {
                    uniformCount[i]++;
                    uniformCount[i - 1]--;
                }

        int answer = 0;

        for (int i = 0; i < uniformCount.length; i++)
            if (!(uniformCount[i] < 0))
                answer++;

        return answer;
    }
}