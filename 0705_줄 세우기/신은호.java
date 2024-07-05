import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();

		int cnt = 0;
		int num = 1;
		while (cnt != N) {
			String str = Integer.toString(num);
			if (!str.contains(L + "")) {
				cnt++;
			}
			num++;
		}
		System.out.println(num - 1);
	}
}
