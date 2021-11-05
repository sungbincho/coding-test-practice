// 프로그래머스 lv1_로또의_최고_순위와_최저_순위

package Programmers;

public class lv1_lotto {
    public static void main(String[] args) {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        Solution solution = new Solution();
        int[] result = solution.solution(lottos, win_nums);
        System.out.print("[");
        for(int i = 0; i<2; i++){
            if (i==0)
                System.out.print(result[i] + ", ");
            if (i==1)
                System.out.print(result[i]);
        }
        System.out.print("]");
    }
}
class Solution {
    int minCount, maxCount = 0;
    int min, max = 0;

    public int ranking(int correctCount){
        int rank = 0;
        if(correctCount == 6)
            rank = 1;
        else if(correctCount == 5)
            rank = 2;
        else if(correctCount == 4)
            rank = 3;
        else if(correctCount == 3)
            rank = 4;
        else if(correctCount == 2)
            rank = 5;
        else
            rank = 6;
        return rank;
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        for(int i =0; i<win_nums.length; i++){
            for(int j = 0; j< lottos.length; j++){
                if(win_nums[i] == lottos[j]){
                    this.minCount++;
                    this.maxCount++;
                }
            }
        }
        for(int i =0; i<lottos.length; i++){
            if(lottos[i] == 0)
                this.maxCount++;
        }

        int[] answer = {ranking(maxCount), ranking(minCount)};
        return answer;
    }
}