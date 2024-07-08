import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int j = 0; j < T; j++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int max = 0;
			for (int i = 1; i <= A && i <= B; i++) {
				if (A % i == 0 && B % i == 0)
					max = i;
			}

			int min = (A * B) / max;

			System.out.println(min);
		}
	}
}
