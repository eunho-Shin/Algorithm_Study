import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);

		int nLen = Integer.parseInt(sc.next()), m = Integer.parseInt(sc.next());
		int[] n = new int[nLen+1], sum = new int[nLen+1], answer = new int[m];

		for (int i = 1; i < n.length; i++) {
			n[i] = Integer.parseInt(sc.next());
			sum[i] = sum[i-1] + n[i];
		}
		
		for(int c = 0;c < answer.length; c++) {
			int i = sc.nextInt(), j = sc.nextInt();
			answer[c] = sum[j]-sum[i-1];
		}
		for(int i = 0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
