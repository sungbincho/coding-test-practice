// 프로그래머스 lv1_비밀지도

package Programmers;

public class lv1_Secret_map {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        Solution_secret_map sm = new Solution_secret_map();
        String[] resultArr = sm.solution(n, arr1, arr2);
        for (String str : resultArr)
            System.out.println(str);
    }
}

class Solution_secret_map {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            str = String.format("%" + n + "s", str);
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");
            answer[i] = str;
        }

        return answer;
    }
}