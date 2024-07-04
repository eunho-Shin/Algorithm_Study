import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 2;

        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                System.out.println(i);
            } else
                i++;
        }
    }
}
