// 프로그래머스 lv2_피로도

package Programmers;

public class lv2_Fatigue_degree {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        Solution_fatigue_degree fd = new Solution_fatigue_degree();
        System.out.println(fd.solution(k, dungeons));
    }
}

class Solution_fatigue_degree {
    boolean[] visitArr;
    int max = 0;

    public int solution(int k, int[][] dungeons) {
        visitArr = new boolean[dungeons.length];
        dungeonsDfs(dungeons, k, 1);
        return max;
    }

    public void dungeonsDfs(int[][] dungeons, int k, int depth) {
        for(int i =0; i< dungeons.length; i++) {
            if(!visitArr[i]) {
                visitArr[i] = true;
                if(k >= dungeons[i][0]) {
                    max = Math.max(max, depth);
                    dungeonsDfs(dungeons, k - dungeons[i][1], depth+1);
                }
                visitArr[i] = false;
            }
        }
    }
}
