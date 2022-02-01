// 프로그래머스 lv3_베스트앨범

package Programmers;

import java.util.*;

public class lv3_Best_album {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        Solution_best_album ba = new Solution_best_album();
        System.out.println(Arrays.toString(ba.solution(genres, plays)));
    }
}

class Solution_best_album {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++)
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);

        ArrayList<String> genre = new ArrayList<>();
        for(String key : map.keySet())
            genre.add(key);

        Collections.sort(genre, (o1, o2) -> map.get(o2) - map.get(o1));

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < genre.size(); i++) {
            String g = genre.get(i);

            int max = 0;
            int firstIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }

            max = 0;
            int secondIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
                    max = plays[j];
                    secondIdx = j;
                }
            }

            list.add(firstIdx);
            if(secondIdx >= 0)
                list.add(secondIdx);
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);

        return result;
    }
}