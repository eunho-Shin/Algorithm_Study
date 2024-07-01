import java.util.Scanner;



public class Main {
	public static void main(String[] args)  {
		
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();

		int[] num = new int[n+1];
		int s = 0;
		num[0] = 0;
		for (int i = 1; i <=n; i++) {
			
			s +=  sc.nextInt();
			num[i] = s;
		
			
			
		}
		
		for (int i = 0; i <m; i++) {
			
			int a = sc.nextInt();
			int b =sc.nextInt();
			System.out.println(num[b] - num[a-1]);
		}
		
		
	}


}
