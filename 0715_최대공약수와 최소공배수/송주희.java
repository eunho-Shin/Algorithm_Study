import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(gcd(n, m));
        System.out.println(lcm(n, m));
    }

    public static int gcd(int n, int m) {
        while (m > 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }
}
