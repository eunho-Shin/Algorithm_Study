import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		int [] num = new int[n];
		int [] sum_list = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);	
		for (int j = 0; j < num.length; j++) {
			cnt += num[j];
			sum_list[j] = cnt;
			
		}
		for (int i = 0; i < sum_list.length; i++) {
			sum += sum_list[i];
			
		}
		
		System.out.println(sum);

	
	}
}
