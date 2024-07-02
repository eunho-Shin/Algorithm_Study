import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class fibo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] tree = new Integer[n];
		int max = 0 , cnt = 0;
		for (int i = 0; i < tree.length; i++) {
			tree[i] = sc.nextInt();
		}
		
		Arrays.sort(tree, Collections.reverseOrder()); 
		
		for (int i = 0; i < tree.length; i++) {
			cnt = tree[i] + i+1;
			if(cnt > max )
				max = tree[i] + i+1;
		}
		System.out.println(max+1);
	}


}
