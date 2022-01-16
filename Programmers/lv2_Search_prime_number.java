// 프로그래머스 lv2_소수_찾기

package Programmers;

import java.util.*;

public class lv2_Search_prime_number {
    public static void main(String[] args) {
        String numbers = "011";
        Solution_search_prime_number spn = new Solution_search_prime_number();
        System.out.println(spn.solution(numbers));
    }
}

class Solution_search_prime_number {
    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;

        dfs(numbers, new boolean[numbers.length()], 0, new StringBuilder());

        for (Integer num : set){
            if (num < 2)
                continue;
            boolean primeNumber = true;
            for(int i = 2; i < num; i++){
                if (num % i == 0) {
                     primeNumber= false;
                    break;
                }
            }
            if (primeNumber)
                answer++;
        }

        return answer;
    }

    public void dfs(String numbers, boolean[] visited, int depth, StringBuilder s){
        for(int i = 0; i < visited.length; i++){
            if(visited[i])
                continue;

            visited[i] = true;
            s.append(numbers.charAt(i));

            set.add(Integer.parseInt(s.toString()));

            dfs(numbers, visited, depth+1, s);
            s.deleteCharAt(s.length()-1);
            visited[i] = false;
        }
    }
}