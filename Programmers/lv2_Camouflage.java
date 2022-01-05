// 프로그래머스 lv2_위장

package Programmers;

import java.util.HashMap;

public class lv2_Camouflage {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Solution_camouflage c = new Solution_camouflage();
        System.out.println(c.solution(clothes));
    }
}


class Solution_camouflage {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < clothes.length; i++){
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 1) + 1);
        }

        for (String key : map.keySet())
            answer *= map.get(key);

        return answer - 1;
    }
}