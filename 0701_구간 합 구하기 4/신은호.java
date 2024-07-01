import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		sc.nextLine();

		String[] strarr = sc.nextLine().split(" ");
		int[] arr = new int[N];
		int[] prefix = new int[N+1];
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(strarr[i]);
			sum += arr[i];
			prefix[i + 1] += sum;
		}

		for (int k = 0; k < M; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			System.out.println(prefix[j]-prefix[i-1]);
		}
	}
}
