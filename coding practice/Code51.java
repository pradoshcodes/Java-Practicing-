import java.util.Scanner;

public class Code51 {
    public static void main(paranthesisChecker[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word:");
        paranthesisChecker s=sc.next();
        paranthesisChecker rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println(rev+" is a pallindrome");
        }else{
            System.out.println(rev+" is not a pallindrome");
        }
    }
}
