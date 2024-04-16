public class Greater {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
       int num3=12;
       if (num1 > num2 && num1 >num3){
        System.out.println("The number " + num1 + " is greater than both numbers");}
        else if (num2 > num1 && num2 > num3 )
            System.out.println("The number " + num2 + " is greater than both numbers");
         else System.out.println("Neither of the above conditions is true.");
    }
}
   
