import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n;
        int cnt = 0;


        while (true){
            int result;
            int a = n / 10; // 10의 자리
            int b = n % 10; // 1의 자리
            int c = (a+b) % 10;

            result = (b*10) + c;
            cnt += 1;

            if (result == n2){
                break;
            }
            n=result;
        }
        System.out.println(cnt);
    }
}
