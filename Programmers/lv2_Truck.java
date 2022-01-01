// 프로그래머스 lv2_다리를_지나는_트럭

package Programmers;

import java.util.*;

public class lv2_Truck {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Solution_truck t = new Solution_truck();
        System.out.println(t.solution(bridge_length, weight, truck_weights));
    }
}

class Solution_truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int temp_weight = 0, idx = 0;
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            if (idx == truck_weights.length)
                break;

            if (queue.size() == bridge_length)
                temp_weight -= queue.poll();

            else if (temp_weight + truck_weights[idx] > weight) {
                queue.offer(0);
                answer++;
            } else {
                queue.offer(truck_weights[idx]);
                temp_weight += truck_weights[idx];
                answer++;
                idx++;
            }
        }
        return answer + bridge_length;
    }
}