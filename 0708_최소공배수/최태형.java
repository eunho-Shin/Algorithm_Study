package 최소공배수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[] answer = new int[t];

		for (int c = 0; c < t; c++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			answer[c] = (a * b) / gcd(a, b);
		}

		for (int i : answer) {
			System.out.println(i);
		}
	}

	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}

		return gcd(b, a % b);
	}
}
