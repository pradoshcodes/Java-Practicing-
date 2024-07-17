//Number is pallindrome or not
import java.util.Scanner;

class Code5{
    public static void main(paranthesisChecker[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        int rev=0;

        while (a!=0) {
            rev=rev*10+ a%10;
            a=a/10;

        }
        if (a==rev) {
            System.out.println(rev+"number is pallindrome.");
        }else{
            System.out.println(rev+"number is not pallindrome.");
        }
    }
}