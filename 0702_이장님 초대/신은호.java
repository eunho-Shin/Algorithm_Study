import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] arr = new Integer[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			arr[i] = arr[i] + (i + 2);
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(arr[0]);
	}
}
