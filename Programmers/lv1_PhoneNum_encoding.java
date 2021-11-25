// 프로그래머스 lv1_핸드폰_번호_가리기

package Programmers;

public class lv1_PhoneNum_encoding {
    public static void main(String[] args) {
        String phone_number = "01012341234";
        Solution_phoneNum_encoding pe = new Solution_phoneNum_encoding();
        System.out.println(pe.solution(phone_number));
    }
}
class Solution_phoneNum_encoding {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i<phone_number.length(); i++){
            if(i >= phone_number.length()-4)
                answer.append(phone_number.charAt(i));
            else
                answer.append("*");
        }
        return answer.toString();
    }
}