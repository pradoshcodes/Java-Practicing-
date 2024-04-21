import java.util.*;
public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sting:");
        String name=sc.nextLine();
        String rev="";
        int n =name.length();
        for(int i = n-1 ; i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("Reversed string is : "+rev);
    }
}
