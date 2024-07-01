import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fibo = sc.nextInt();
		long[] num_list = new long[fibo+1];
		num_list[0] = 0;
		num_list[1] = 1;
		long result = 0;
		for (int i = 2; i < num_list.length; i++) {
			num_list[i] = num_list[i-1] + num_list[i-2];
		}
		System.out.println(num_list[fibo]);
		
	}

}
