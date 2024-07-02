import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] tree = new int[n];
		
		for(int i=0; i<tree.length; i++){
			tree[i] = sc.nextInt();
		}
		
		Arrays.sort(tree);
		
		int maxDay = 0;
        for (int i = tree.length-1; i >= 0; i--) {
            maxDay = Math.max(maxDay, n - i + 1 + tree[i]);
        }

        // 출력
        System.out.println(maxDay);
	}
}
