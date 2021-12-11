// 프로그래머스 lv2_파일명_정렬

package Programmers;

import java.util.*;

public class lv2_File_name_sort {
    public static void main(String[] args) {
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        Solution_file_name_sort fns = new Solution_file_name_sort();
        String[] resultArr = fns.solution(files);
        System.out.println(Arrays.toString(resultArr));
    }
}
class Solution_file_name_sort {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                String h1 = s1.split("[0-9]")[0];
                String h2 = s2.split("[0-9]")[0];

                int result = h1.toLowerCase().compareTo(h2.toLowerCase());
                if (result == 0)
                    result = convertNum(s1, h1) - convertNum(s2, h2);

                return result;
            }
        });

        return files;
    }

    public int convertNum(String s, String h){
        s = s.substring(h.length());

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c) && sb.length() < 5)
                sb.append(c);
            else
                break;
        }
        return Integer.valueOf(sb.toString());
    }
}