// 프로그래머스 lv2_주식가격

package Programmers;

public class lv2_Stock_price {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        Solution_stock_price sp = new Solution_stock_price();
        int[] resultArr = sp.solution(prices);
        for(int i : resultArr)
            System.out.println(i);
    }
}

class Solution_stock_price {
    public int[] solution(int[] prices) {
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                ans[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return ans;
    }
}