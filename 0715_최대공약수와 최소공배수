import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = a * b;
		int tmp = a;
		while(b != 0) {
			tmp = b;
			a = a%b;
			b= a;
			a = tmp;
		}
		System.out.println(a);
		System.out.println(max/tmp);
	}
}
