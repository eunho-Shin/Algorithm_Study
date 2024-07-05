import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String l = String.valueOf(sc.nextInt());
		int i = 1,c=0;
		
		for(;;) {
			int t=0;
			String stri = i+"";
			if(!stri.contains(l)) {
				t = i;
				i++;
				c++; 
				if(c==n) {
					System.out.println(t);
					break;
				}
			} else {
				i++;
			}
		}
	}
}
