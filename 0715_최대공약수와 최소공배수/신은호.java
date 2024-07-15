import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int g = sc.nextInt();
			int s = sc.nextInt();
			
			int j = s - 1;
			if (g == 1) {
				while (j < N) {
					arr[j] = arr[j] ==0 ? 1 : 0;
					j += s;
				}
			} else {
				arr[j] = arr[j] == 0 ? 1 : 0;
				int k = 1;
				if (j != 0 && j != (N - 1)) {
					while ((arr[j - k] == arr[j + k])) {
						arr[j - k] = arr[j - k] == 0 ? 1 : 0;
						arr[j + k] = arr[j + k] == 0 ? 1 : 0;
						k++;
						if (j - k < 0 || j + k > (N - 1))
							break;
					}
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}
}
