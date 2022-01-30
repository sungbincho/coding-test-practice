// 프로그래머스 lv3_단속카메라

package Programmers;

import java.util.Arrays;

public class lv3_Speed_camera {
    public static void main(String[] args) {
        int[][] routes = {{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};
        Solution_speed_camera sc = new Solution_speed_camera();
        System.out.println(sc.solution(routes));
    }
}

class Solution_speed_camera {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        int cnt = 0;

        int min = Integer.MIN_VALUE;
        for (int[] route : routes) {
            if (min < route[0]) {
                min = route[1];
                cnt++;
            }
        }
        return cnt;
    }
}