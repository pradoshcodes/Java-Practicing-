//reverse a number 

import java.util.Scanner;
public class Code {

    public static void main(paranthesisChecker[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        // int rev=0;
        // while(num!=0){
        //     rev=rev*10+num%10;
        //     num=num/10;
        // }

        //Using StringBuffer
        // StringBuffer bf=new StringBuffer(String.valueOf(num));
        // StringBuffer rev=bf.reverse();
        // System.out.println("Reverse of the number is: "+rev);


        //Using StringBuilder
         StringBuilder sb=new StringBuilder();
         sb.append(num);
         StringBuilder rev=sb.reverse();
         System.out.println("Reverse of the number is: "+rev);
    }
}