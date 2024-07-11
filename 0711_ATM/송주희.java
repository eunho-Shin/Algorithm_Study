import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 리스트로 받고
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            arr.add(sc.nextInt());
        }

        int result = 0;
        // 오름차순 정렬 후
        Collections.sort(arr);

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                result += arr.get(j);
            }
        }
        System.out.println(result);
    }
}
