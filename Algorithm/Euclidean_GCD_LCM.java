package Algorithm;

public class Euclidean_GCD_LCM {

    // 재귀함수를 활용한 최대공약수 구하기
    public static int Recursive_GCD(int a, int b) {
        // 나머지가 0이라면 해당 수가 최종 최대 공약수이다.
        if (a % b == 0) {
            return b;
        }
        // 그렇지 않다면 제수를 다음 피제수로, 나머지를 다음 제수로 바꾸어 재귀를 진행한다.
        else {
            return Recursive_GCD(b, a % b);
        }
    }

    // 반복문을 활용한 최대공약수 구하기
    public static int Repetitive_GCD(int a, int b){
        int tmp;

        while(b > 0){      //b가 0이 될 때까지
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    // 유클리드 호제법으로 최대공약수(GCD)를 구한 후 최소공배수(LCM)을 구할 수 있다.
    public static int LCM(int a, int b) {
        return (a * b) / Recursive_GCD(a, b);
    }

    public static void main(String[] args) {
        int a = 1112;
        int b = 695;

        System.out.println(Recursive_GCD(a, b));
        System.out.println(Repetitive_GCD(a, b));
        System.out.println(LCM(a, b));
    }
}

