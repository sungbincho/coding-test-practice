// 프로그래머스 lv2_멀정한_사각형

package Programmers;

public class lv2_Just_rectangle {
    public static void main(String[] args) {
        int w = 8;
        int h = 12;
        Solution_just_rectangle jr = new Solution_just_rectangle();
        System.out.println(jr.solution(w, h));
    }
}

class Solution_just_rectangle {
    public long solution(int w, int h) {
        long sum = 0;
        double width = w;
        double height = h;
        double length = 0;

        for(int i = 1; i <= w; i++) {
            length = Math.floor(height - height / width * i);
            sum += length;
        }

        return sum * 2;
    }
}
