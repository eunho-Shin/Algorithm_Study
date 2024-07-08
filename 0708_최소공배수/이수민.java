import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a  = sc.nextInt();
			int b = sc.nextInt();
			int max = a * b;
			int tmp = a;
			while(b != 0) {
				tmp = b;
				a = a%b;
				b= a;
				a = tmp;
			}
			System.out.println(max/tmp);
			
		}
	
	}
}
