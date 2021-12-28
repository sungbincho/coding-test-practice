// 프로그래머스 lv2_전화번호_목록

package Programmers;

import java.util.Arrays;

public class lv2_Phone_book {
    public static void main(String[] args) {
        String[] phone_book = {"12", "123", "1235", "567", "88"};
        Solution_phone_book pb = new Solution_phone_book();
        System.out.println(pb.solution(phone_book));
    }
}

class Solution_phone_book {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}