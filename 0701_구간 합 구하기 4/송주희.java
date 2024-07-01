import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for (int i =0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 누적합 담을 배열
        int[] prefixSum = new int[arr.length+1];

        for (int i = 1; i < prefixSum.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i-1];
        }

        for (int i =1; i <= m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(prefixSum[b]-prefixSum[a-1]);

        }
    }
}
