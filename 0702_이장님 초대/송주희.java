import static java.lang.Math.max;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 묘목 개수 n 입력 받기
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i =0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        Integer[] result = new Integer[n];

        for (int i = 0; i<arr.length; i++) {
            result[i] = arr[i]+1+i;
        }

        int max = 0;

        for (int i = 0; i<result.length; i++) {
            max = max(result[i], max);
        }
        System.out.println(max+1);
    }
}
