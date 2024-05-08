//If we create any final varible ,it become constant we can not change the value of  final variable.
// public class Final {
//     public static void main(String[] args) {
//         final int i=10;
//          i=i+20;
//         System.out.println(i);
//     }  
// }




//If we create any final method we can not override it.
// public class Final {

//     final void m1(){
//         System.out.println("Hello World");
//     }
// }

//     class Rule extends Final{
//       void m1()
//       {
//         System.out.println("I am in class test");
//       }
//       public static void main(String[] args) {
//         Rule r=new Rule();
//         r.m1();
//       }
//     }




//If we create any final class,we can not extend it or inherit it.
    final public class Final {

         void m1(){
            System.out.println("Hello World");
        }
    }
    
        class Rule extends Final{
          void m1()
          {
            System.out.println("I am in class test");
          }
          public static void main(String[] args) {
            Rule r=new Rule();
            r.m1();
          }
        }
   
 

