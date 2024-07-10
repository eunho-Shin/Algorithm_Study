import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 박수 카운트
        int clap = 0;

        for (int i = 0; i <= n; i++) {
            clap += countInt(i);
        }
        System.out.println(clap);
    }

    public static int countInt(int n) {
        String str = Integer.toString(n);

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
                cnt++;
            }
        }
        return cnt;
    }
}
