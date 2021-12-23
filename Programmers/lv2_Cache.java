// 프로그래머스 lv2_캐시

package Programmers;

import java.util.*;

public class lv2_Cache {
    public static void main(String[] args) {
        int cacheSize = 5;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        Solution_cache cache = new Solution_cache();
        System.out.println(cache.solution(cacheSize, cities));
    }
}

class Solution_cache {
    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;

    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0)
            return 5 * cities.length;

        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        for(int i = 0 ; i < cities.length ; ++i){
            String city = cities[i].toUpperCase();

            // cache hit
            if(cache.remove(city)){
                cache.addFirst(city);
                answer += CACHE_HIT;
            }
            // cache miss
            else {
                if(cache.size() == cacheSize)
                    cache.pollLast();

                cache.addFirst(city);
                answer += CACHE_MISS;
            }
        }
        return answer;
    }
}
