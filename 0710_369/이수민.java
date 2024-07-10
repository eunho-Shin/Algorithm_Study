import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int t;
		
		for (int i = 1; i <= n; i++) {
			t = i;
			while (t !=0) {				
				if (t%10 == 3 || t%10 == 6 || t % 10 == 9 ) {
					cnt++;
					
				}
				
				t /= 10;
			}

		}
		System.out.println(cnt);
			
		
	
	}
}
