import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int count = 0;
		for (int i = 1; i <= N; i++) {
			int digit = (int) Math.log10(i) + 1;
			int cmp = i;
			for (int j = 1; j <= digit; j++) {
				int temp = cmp % (int) Math.pow(10, j);
				if (temp == 3 || temp == 6 || temp == 9) {
					count++;
				}
				cmp = cmp / (int) Math.pow(10, j);
			}
		}
		System.out.println(count);
	}
}
