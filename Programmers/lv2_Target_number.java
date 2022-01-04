// 프로그래머스 lv2_타겟_넘버

package Programmers;

public class lv2_Target_number {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        Solution_target_number tn = new Solution_target_number();
        System.out.println(tn.solution(numbers, target));
    }
}
class Solution_target_number {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, 0, 0, target);
        return answer;
    }

    public int dfs(int[] numbers, int depth, int sum, int target){
        if(depth == numbers.length){
            if(target == sum)
                return 1;
            else
                return 0;
        }
        else{
            return dfs(numbers, depth + 1, sum + numbers[depth], target) +
                    dfs(numbers, depth + 1, sum - numbers[depth], target);
        }
    }
}
