//case-1
//super() keyword can be used to immediate parents class method.

// public class SuperRule {
//     void display(){
//         System.out.println("I am in super class");
//     }
// }
// class This extends SuperRule{
//     void show(){
//         super.display();
//     }
//     public static void main(String[] args) {
//         This th=new This();
//         th.show();
//     }
// }


// public class SuperRule {
//     void display(){
//         System.out.println("I am in super class");
//     }
// }
// class This extends SuperRule{
//     void display(){
//         System.out.println("i am in child class");
//     }
//     void show(){
//         super.display();
//         this.display();
//     }
//     public static void main(String[] args) {
//         This th=new This();
//         th.show();
//     }
// }


//case-2
//super() can be used to invoke immediate parents class constructor.
public class SuperRule {
    SuperRule(){
        System.out.println("I am in super class");
    }
}
class This extends SuperRule{
    This(){
        super();//Here if you are not using super keyword compiler automatically add the super() keyword here
        System.out.println("i am in child class.");
    }
    public static void main(String[] args) {
        This th=new This();
    }
}



