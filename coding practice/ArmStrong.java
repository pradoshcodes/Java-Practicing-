import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int leng = 0;
        int arm = 0;
        int temp = n; // Store the original number in a temporary variable

        // Calculate the length of the number
        while (temp != 0) {
            leng = leng + 1;
            temp = temp / 10;
        }

        temp = n; // Reset the temporary variable to the original number

        // Calculate the sum of the digits raised to the power of the length
        while (temp != 0) {
            int rem = temp % 10;
            int mul = 1;
            for (int i = 0; i < leng; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            temp = temp / 10;
        }

        // Check if the sum is equal to the original number
        if (arm == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
