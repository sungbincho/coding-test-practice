// 프로그래머스 lv1_최소직사각형

package Programmers;

public class lv1_Min_rectangle {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Solution_min_rectangle mr = new Solution_min_rectangle();
        System.out.println(mr.solution(sizes));
    }
}

class Solution_min_rectangle {
    public int solution(int[][] sizes) {
        int widthMax = 0;
        int heightMax = 0;

        for(int i = 0; i<sizes.length; i++){
            int wMax = Math.max(sizes[i][0],sizes[i][1]);
            int hMax = Math.min(sizes[i][0],sizes[i][1]);
            widthMax = Math.max(widthMax,wMax);
            heightMax = Math.max(heightMax, hMax);
        }

        int answer = widthMax * heightMax;
        return answer;
    }
}

