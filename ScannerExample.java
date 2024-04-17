import java.util.*;  
public class ScannerExample {  
public static void main(String args[]){  
          Scanner sc = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = sc.next();  
          System.out.println("Enter your gander");
          char gender=sc.next().charAt(0);
          System.out.println("Enter your age");
          int age=sc.nextInt();  
          System.out.printf("Enter your phone number");
          Long phone=sc.nextLong();
          System.out.println("Name is: " + name);             
          System.out.println("gender is: " + gender);             
          System.out.println("age is: " + age);             
          System.out.println("phone number is: " + phone);             
                       
          }  
}  

