import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        
        int count = 0;
        int number = 0;
        
        while (count < N) {
            number++;
            if (!String.valueOf(number).contains(String.valueOf(L))) {
                count++;
            }
        }
        
        System.out.println(number);
    }
}
