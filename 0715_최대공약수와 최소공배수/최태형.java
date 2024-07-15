import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] answer = new int[2];
		answer[0] = gcd(a,b);
		answer[1] = (a * b) / gcd(a, b);
		
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
