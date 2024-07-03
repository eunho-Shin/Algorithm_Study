import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] num = new int[n];
		int sum = 0;
		int end = 0;
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}

		
		for (int i = 0; i < num.length; i++) {
			while(end <n && sum <n) {
				sum += num[end];
				end++;
			}
			if (sum == n) cnt++; 
			sum -= num[i];
			
		}
		System.out.println(cnt);
	}


}
