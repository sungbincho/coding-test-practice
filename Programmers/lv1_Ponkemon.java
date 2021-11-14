package Programmers;

import java.util.*;

public class lv1_Ponkemon {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        Solution_ponkemon sp = new Solution_ponkemon();
        System.out.println(sp.solution(nums));
    }
}

class Solution_ponkemon {
    public int solution(int[] nums) {
        HashSet<Integer> ponkemon = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            ponkemon.add(nums[i]);
        }
        return (nums.length / 2 > ponkemon.size()) ? ponkemon.size() : nums.length / 2;
    }
}

