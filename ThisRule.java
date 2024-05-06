//case-1
//if you don't use this keyword compiler automatically adds this keyword while invoking the method.
// public class ThisRule {
//     void display(){
//         System.out.println("This is a rule.");
//     }
//     void show(){
//         display();
//     }
//     public static void main(String[] args) {
//         ThisRule tr = new ThisRule();
//         tr.show();
//     }
// }


//case-2
//this() keyword can be used to invoke current class constructor.
// public class ThisRule {
//     ThisRule(){
//         System.out.println("No argument constructor");
//     }
//     ThisRule(int i){
//         this();
//         System.out.println("parameterized constructor");
//     }//to call no-args constructor we use this() keyword.
//     public static void main(String[] args) {
//         ThisRule tr= new ThisRule(50);
        
//     }
// }
// public class ThisRule {
//     ThisRule(){
//         this(50);
//         System.out.println("No argument constructor");
//     }
//     ThisRule(int i){
//         System.out.println("parameterized constructor");
//     }//to call no-args constructor we use this() keyword.
//     public static void main(String[] args) {
//         ThisRule tr= new ThisRule();
        
//     }
// }



//case-3
//This keyword can be used to pass as an argument in the method call.
// public class ThisRule {
//     void m1(ThisRule tr){
//         System.out.println("i am in m1 method.");
//     }
//     void m2(){
//         m1(this);
//     }
//     public static void main(String[] args) {
//         ThisRule tr= new ThisRule();
//         tr.m2();
        
//     }
// }


//case-4
//this keyword can be used to pass as an argument in the constructor call.
// class Test{
//     Test(ThisRule tr){
//         System.out.println("I am inside the constructor of Test class.");
//     }
// }
// public class ThisRule {
//    void m1(){
//     Test t=new Test(this);
//    }
//     public static void main(String[] args) {
//         ThisRule tr= new ThisRule();
//         tr.m1();
        
//     }
// }


//case-5
//this keyword can be used to return the current  class instance from the method.
class ThisRule{
    ThisRule m1(){
        return this;
    }
    public static void main(String[] args) {
        ThisRule tr = new ThisRule().m1();
        System.out.println("I am inside the main method of ");
    }
}