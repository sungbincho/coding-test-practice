// 프로그래머스 lv2_방문길이

package Programmers;

import java.util.*;

public class lv2_Visit_length {
    public static void main(String[] args) {
        String dirs = "ULURRDLLU";
        Solution_visit_length vl = new Solution_visit_length();
        System.out.println(vl.solution(dirs));
    }
}

class Solution_visit_length {
    public int solution(String dirs) {
        HashSet<String> set = new HashSet<>();
        int cx = 0, cy = 0;

        for(int i = 0; i<dirs.length(); i++){
            char c = dirs.charAt(i);
            int nx = cx;
            int ny = cy;

            if(c == 'U' && cy + 1 <= 5)
                cy++;
            else if(c == 'D' && cy - 1 >= -5)
                cy--;
            else if(c == 'L' && cx + 1 <= 5)
                cx++;
            else if(c == 'R' && cx - 1 >= -5)
                cx--;

            if(nx == cx && ny == cy)
                continue;

            set.add(cx + "" + cy + "" + nx + "" + ny);
            set.add(nx + "" + ny + "" + cx + "" + cy);
        }
        return set.size() / 2;
    }
}