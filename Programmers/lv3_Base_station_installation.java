// 프로그래머스 lv3_기지국_설치

package Programmers;

public class lv3_Base_station_installation {
    public static void main(String[] args) {
        int n = 11;
        int[] stations = {4, 11};
        int w = 1;
        Solution_base_station_installation bsi = new Solution_base_station_installation();
        System.out.println(bsi.solution(n, stations, w));
    }
}

class Solution_base_station_installation {
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int location = 1;
        int idx = 0;

        while (location <= n) {
            if (idx < stations.length && location >= stations[idx] - w) {
                location = stations[idx] + w + 1;
                idx++;
            } else {
                location += 2 * w + 1;
                answer++;
            }
        }
        return answer;
    }
}