// 프로그래머스 lv1_다트_게임

package Programmers;

public class lv1_Darts_game {
    public static void main(String[] args) {
        String dartResult = "1D2S#10S";
        Solution_darts_game dg = new Solution_darts_game();
        System.out.println(dg.solution(dartResult));
    }
}

class Solution_darts_game {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int num = 0, scoreIndex = 0;

        for(int i = 0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)){  // 숫자 일 때
                if (c == '1' && dartResult.charAt(i + 1) == '0'){  // 숫자 10 판별
                    num = 10;
                    i++;
                } else   // 숫자 10이 아닐 때
                    num = Character.getNumericValue(c);
            }
            else{  // 문자 일 때
                switch (c) {
                    case 'S':
                        score[scoreIndex++] = (int) Math.pow(num, 1);
                        break;
                    case 'D':
                        score[scoreIndex++] = (int) Math.pow(num, 2);
                        break;
                    case 'T':
                        score[scoreIndex++] = (int) Math.pow(num, 3);
                        break;
                    case '*':    // 스타상(2배)
                        score[scoreIndex-1] *= 2;
                        if (scoreIndex-1 > 0)
                            score[scoreIndex-2] *= 2;
                        break;
                    case '#':    // 아차상(마이너스)
                        score[scoreIndex-1] *= -1;
                        break;
                }
            }
        }
        return score[0] + score[1] + score[2];
    }
}
