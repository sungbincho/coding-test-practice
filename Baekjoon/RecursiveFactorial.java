package Baekjoon;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        sc.close();
        System.out.print(Factorial(num));
    }
    public static int Factorial(int num){
        if(num <= 1)
            return 1;
        else
            return (num * Factorial(num-1));
    }
}
