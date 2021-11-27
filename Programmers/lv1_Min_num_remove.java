// 프로그래머스 lv1_제일_작은_수_제거하기

package Programmers;

public class lv1_Min_num_remove {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Solution_min_num_remove mnr = new Solution_min_num_remove();
        int[] resultArray = mnr.solution(arr);
        for(int i : resultArray)
            System.out.println(i);
    }
}

class Solution_min_num_remove {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer2 = new int[1];
            answer2[0] = -1;
            return answer2;
        }

        int min = arr[0];
        for(int i = 0; i<arr.length; i++)
            if(arr[i] < min)
                min = arr[i];

        int[] answer = new int[arr.length -1];
        int count = 0;
        for(int i : arr){
            if(i == min)
                continue;
            answer[count++] = i;
        }
        return answer;
    }
}
