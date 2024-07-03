import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			double b = (-1.0 + Math.sqrt(1.0 + 4.0 * ((double) i * (double) i - (double) i + 2.0 * (double) N))) / 2.0;

			if (b % 1 == 0.0) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
