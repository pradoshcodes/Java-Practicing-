import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        System.out.println("Select option(+,-,/,*)");
        char opt=sc.next().charAt(0);
        switch (opt){
            case '+':
                System.out.println("Result:" + (num1+num2));
                break;
            case '-':
                System.out.println("Result:" + (num1-num2));
                break;
            case '/':
                if(num2==0)  
                   System.out.println("Error! Division by zero is not allowed.");  
                else 
                   System.out.println("Result:"+(float)(num1/num2));    
                break;
            case '*':
                System.out.println("Result:"+(num1*num2));
                break;
            default :  
               System.out.println("Invalid Option!");    
       }  
    }
}
