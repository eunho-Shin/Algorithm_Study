import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n 입력 받기
		int n = Integer.parseInt(br.readLine());

		int i, j;
		int m = n;
		for (i = 2; i <= (int) Math.sqrt(n); i++) {
			for (j = 2; j < (int) Math.sqrt(n); j++) {
				if (i % j == 0)
					break;
			}
			if (i == j) {
				while (m % i == 0) {
					System.out.println(i);
					m /= i;
				}
			}
		}
		if(m>(int)Math.sqrt(n))
			System.out.println(m);
	}
}
