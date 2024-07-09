import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = N;

		int cycle = 0;

		if (N < 10) {
			num = num * 10 + num;
			cycle++;
		}

		do {
			num = (num % 10) * 10 + (num / 10 + num % 10) % 10;

			cycle++;
		} while (num != N);

		if(N==0) 
			System.out.println(1);
		else
			System.out.println(cycle);
	}
}
