import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 값 n 받기
        int n = scanner.nextInt();
        long[] longArray = new long[n+1];
        longArray[0] = 0;    longArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            longArray[i] = longArray[i-1] + longArray[i-2];
        }
        System.out.println(longArray[n]);
    }
}
