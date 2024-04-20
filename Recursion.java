// public class Recursion {
//    static int fact=1;
//   public static void main(String[] args) {
//    int num=5;
//    Recursion  r = new Recursion();
//    r.call(num);
//    System.out.println("factorial of "+num+" is :"+fact);
//   }
//   void call(int num){
//    if (num >=1) {
//       fact=fact*num;
//       call(num-1);
//    }
//   }
//  }
 

import java.util.*;
public class Recursion {
   static int fact=1;
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number:");
   int num = sc.nextInt();
   Recursion  r = new Recursion();
   r.call(num);
   System.out.println("factorial of "+num+" is :"+fact);
  }
  void call(int num){
   if (num >=1) {
      fact=fact*num;
      call(num-1);
   }
  }
 }
 