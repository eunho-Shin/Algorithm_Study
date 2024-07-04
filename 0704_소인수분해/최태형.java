import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		if(n!=1) {
			for(int x = 2;n/x!=0; ) {
				if(n%x==0) {
					n /=x;
					System.out.println(x);
				}else if(n%x!=0&&x%2==0) {
					x++;
				}else if(n%x!=0){
					x+=2;
				}
			}
		} 
	}
}
