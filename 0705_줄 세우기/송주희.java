package day22_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String str1 = String.valueOf(l);

		ArrayList<Integer> intArray = new ArrayList<>();
		int cnt = 0;
		int i = 1;

		while(true) {
			// 사용 가능한 수라면?
			String str = String.valueOf(i);
			boolean contains = str.contains(str1);

			if(!str.contains(str1)) {
				intArray.add(i);
				i+=1;
				cnt +=1;

				// 근데 꽉 차면 반복문 종료
				if(cnt == n) {
					int lastIndex = intArray.size()-1;
					System.out.println(intArray.get(lastIndex));
					break;
				}
			} else {
				// 사용할 수 없는 수라면
				i+=1;
			}
		}
	}
}
