// 프로그래머스 lv2_N개의_최소공배수

package Programmers;

public class lv2_N_LCM {
    public static int GCD(int a, int b){
        if(a % b == 0)
            return b;
        else
            return GCD(b, a%b);
    }

    public static int LCM(int a, int b){
        return (a*b) / GCD(a, b);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};

        if (arr.length == 1)
            System.out.println(arr[0]);
        else if(arr.length == 2)
            System.out.println(LCM(arr[0], arr[1]));
        else {
            int tmp = LCM(arr[0], arr[1]);
            for(int i = 2; i<arr.length; i++)
                tmp = LCM(tmp, arr[i]);
            System.out.println(tmp);
        }
    }
}
