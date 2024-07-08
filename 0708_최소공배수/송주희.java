import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트
        int t = sc.nextInt();

        // 최소 공배수 = 두 수의 곱 / 최대공약수
        // 테스트 t만큼 반복
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();   int b = sc.nextInt();
            int lcm = gcd(a, b);
            System.out.println(a*b/lcm);
        }
    }

    /*
       최대공약수
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
