// 프로그래머스 lv1_소수_만들기

package Programmers;

public class lv1_Make_prime_number {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        Solution_make_prime_number pn= new Solution_make_prime_number();
        System.out.println(pn.solution(nums));
    }
}
class Solution_make_prime_number {
    public boolean primeCheck(int num){
        for(int i = 2; i < num; i++)
            if (num % i == 0) return false;
        return true;
    }

    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    int temp = nums[i] + nums[j] + nums[k];
                    if(primeCheck(temp))
                        answer++;
                }
            }
        }
        return answer;
    }
}