// 프로그래머스 lv1_K번째수

package Programmers;

import java.util.Arrays;

public class lv1_K_num {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution_k_num kn = new Solution_k_num();
        int[] result = kn.solution(array, commands);
        for(int i : result)
            System.out.println(i);
    }
}

class Solution_k_num {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            int[] temp_array = new int[(commands[i][1]-commands[i][0])+1];
            int k = 0;
            for(int j = (commands[i][0]-1); j<commands[i][1]; j++)
                temp_array[k++] = array[j];
            Arrays.sort(temp_array);
            answer[i] = temp_array[commands[i][2]-1];
        }
        return answer;
    }
}