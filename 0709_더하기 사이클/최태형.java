import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(0 <= n && n <= 99) {
			int m=0;
			int c = 1;
			int a = n/10, b = n%10;
			m = (b*10)+ ((a+b)%10);
			while(m!=n) {
				if (m == n)
					break;
				a = m/10; b = m%10;
				m = (b*10)+ ((a+b)%10);
				c++;
			}
			System.out.println(c);
			break;
		}
		
	}
}
