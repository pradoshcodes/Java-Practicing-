// public class MethodOverloading {
//     void show(){
//         System.out.println("First Show method parameters");
//     }
//     void show(int a){
//         System.out.println("Second Show method with parameter");
//     }
//     public static void main(String[] args) {
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.show(10);
//     }
// }




// 1-can we achieve method overloading by changing the return type of method only?
// Ans-in java,method overloading is not possible by changing the return type of the method only because of ambiguity. 
// public class MethodOverloading {
//     void show(){
//         System.out.println("First Show method parameters");
//     }
//     int show(int a){
//         System.out.println("Second Show method with parameter");
//     }
//     public static void main(String[] args) {
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.show(10);
//     }
// }



//2-can we overload main() method?
//yes we can have any number of main methods in a class by method overloading.This is because JVM always calls main() method which receives string array as argument only.
// public class MethodOverloading {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.main(10);
//     }
//     public static void main(int a){
//         System.out.println("Main method is called with integer argument "+a);
//     }
// }

//case-1
//Automation Promotion
//One type is promoted to another implicitly if no matching datatypes is found.
// public class MethodOverloading {
//     void show(int a){
//         System.out.println("First Show method parameters");
//     }
//     void show(String a){
//         System.out.println("Second Show method with parameter");
//     }
//     public static void main(String[] args) {
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.show("abc");
//         mo.show('a');//character

//     }
// }

// case-2
// Object<---String
// (Object is the parent class of all the class in java)
// public class MethodOverloading {
//     void show(Object a){
//         System.out.println("First Show method parameters");
//     }
//     void show(String a){
//         System.out.println("Second Show method with parameter");
//     }
//     public static void main(String[] args) {
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.show(10);
//         mo.show('a');
//     }
// }
// public class MethodOverloading {
//     void show(Object a){
//         System.out.println("First Show method parameters");
//     }
//     void show(String a){
//         System.out.println("Second Show method with parameter");
//     }
//     public static void main(String[] args) {
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.show("abc");(While resolving overloaded methods,compiler will give precedence for the child type argument than compared with parent type argument.)
//     }
// }



//case-3
//String and StringBuffer are at same level so"null" can not be refered ,if refered ambigious error will occur.
// public class MethodOverloading {
//     void show(StringBuffer a){
//         System.out.println("First Show method parameters");
//     }
//     void show(String a){
//         System.out.println("Second Show method with parameter");
//     }
//     public static void main(String[] args) {
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.show("abc");
//         mo.show(new StringBuffer("xyz"));
//         mo.show(null);

//     }
// }



//case-4
// public class MethodOverloading {
//     void show(int a,float b){
//         System.out.println("First Show method parameters");
//     }
//     void show(float a,int b){
//         System.out.println("Second Show method with parameter");
//     }
//     public static void main(String[] args) {
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.show(10,20.5f);
//         mo.show(20.7f,10);
//         mo.show(10,20);(error: reference to show is ambiguous)
//     }
// }


//case-5
//The varargs allows the method to accept zero or multiple arguments.Before varargs eihter we use overloaded method or take an array as the method parameter but it was not considered good because it leads to the maintenance problem.if we donot know how many arguments we will have to pass in the method,arargs is the better approch.
// public class MethodOverloading {
//     void show(int a){
//         System.out.println("First Show method parameters");
//     }
//     void show(int... a){
//         System.out.println("Second Show method with parameter");
//     }
//     public static void main(String[] args) {
//         MethodOverloading mo=new MethodOverloading() ;
//         mo.show(10);
//         mo.show(10,20,30);(varargs get least priority i.e.if no other method matched then only varargs method will get the chance,because int came in 1.0 version and varargs came in 1.5 version.)
//     }
// }