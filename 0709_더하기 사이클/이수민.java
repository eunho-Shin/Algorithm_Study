import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int result =n;
		while(true) {
			int a = n / 10;
			
			int b = n % 10;
			int k = a + b;
			n = k%10 + b * 10;
			cnt++;
			if (result == n) break;
		}
		System.out.println(cnt);
		
			
		
	
	}
}
