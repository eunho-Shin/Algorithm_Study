package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day20 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// n 입력 받기
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for (int i = 1; i <=n; i++) {
			int result = 0;
			for (int j = i; j<=n; j++) {
				result += j;
				
				if (result == n) {
					cnt ++;
					break;
				}
				else if(result >n) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
