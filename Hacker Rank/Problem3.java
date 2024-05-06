//Given an integer, N, print its first 10  multiples. Each multiple N*i(where 1<=i<=10) should be printed on a new line in the form: N x i = result.
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}

