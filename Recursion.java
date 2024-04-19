public class Recursion {
   
    // Removed unnecessary instance variable 'fact'
 
    // Modified the method to return an int (factorial value)
    int call(int num) {
      // Initialize fact to 1 for each call
      int fact = 1;
      if(num > 1){
         // Calculate factorial recursively
         fact = fact * call(num - 1);
         System.out.print("*" + num);
      }
      return fact;
    }
    
    public static void main(String[] args) {
       int num = 5;
       int res;
       Recursion r = new Recursion(); // Changed to Recursion class
       res = r.call(num); // Changed to call method from Recursion class
       System.out.println(res); // Print the result
    }
 }
 