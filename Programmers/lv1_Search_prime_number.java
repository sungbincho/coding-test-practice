// 프로그래머스 lv1_소수_찾기

package Programmers;

import java.util.*;

public class lv1_Search_prime_number {
    public static void main(String[] args) {
        int n = 10;
        Solution_search_primeNumber sp = new Solution_search_primeNumber();
        System.out.println(sp.solution(n));
    }
}

class Solution_search_primeNumber {
    public int solution(int n) {
        int answer = 0;
        boolean[] primeNumber =new boolean [n+1];

        Arrays.fill(primeNumber, true);

        for(int i=2; i <= (int)Math.sqrt(n); i++){
            if(primeNumber[i]==true)
                for(int j=i; i*j<=n; j++)
                    primeNumber[i*j]=false;
        }
        for(int i =2; i<=n; i++)
            if(primeNumber[i]==true)
                answer++;

        return answer;
    }
}
