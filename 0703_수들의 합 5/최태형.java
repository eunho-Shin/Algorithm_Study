import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = 0;
		

		for (int i = n; i > 0 ; i--) {
			int sum = 0;
			sum += i;
			if (sum == n) {
				c++;
			} else {
				for(int j = i-1 ;0<sum &&sum < n ; j--) {
					sum += j;
					if(sum == n) {
						c++;
						break;
					}
				}
			}

		}
		System.out.println(c);
	}
}
