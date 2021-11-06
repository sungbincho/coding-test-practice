// 프로그래머스 lv1_키패드_누르기

package Programmers;

public class lv1_Keypad {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        Solution_keypad solution = new Solution_keypad();
        System.out.println(solution.solution(numbers, hand));
    }
}

class Solution_keypad {
    int left_index = 10;
    int right_index = 12;
    int[][] keypad_index = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,1},{3,2}};

    public int distance(int numbers, int index) {
        int x = Math.abs((keypad_index[index - 1][0]) - (keypad_index[numbers - 1][0]));
        int y = Math.abs((keypad_index[index - 1][1]) - (keypad_index[numbers - 1][1]));
        return (x + y);
    }

    public String solution(int[] numbers, String hand) {
        String answer = "";

        for(int i = 0; i< numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                left_index = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                right_index = numbers[i];
            } else {
                if (numbers[i] == 0)
                    numbers[i] = 11;

                int left_Length = distance(numbers[i], left_index);
                int right_Length = distance(numbers[i], right_index);

                if(left_Length > right_Length) {
                    answer += "R";
                    right_index = numbers[i];
                } else if(left_Length < right_Length) {
                    answer += "L";
                    left_index = numbers[i];
                } else {
                    if(hand.equals("right")) {
                        answer += "R";
                        right_index = numbers[i];
                    } else {
                        answer += "L";
                        left_index = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}
