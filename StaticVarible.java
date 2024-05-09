//Static keyword is a non-access modifier.
// public class StaticVarible {
//     static int a=10;

//     void m1(){
//         static int b=20;//error: illegal start of expression
//     }
    
// }//we can not use  static keyword with local varible

//case-1
// public class StaticVarible {
//     static int a = 10;
// }
// class Test{
//     public static void main(String[] args) {
//         System.out.println("Value of a : " + StaticVarible.a);
// }//here we don't need to create an object of a static varible.we can call static varible by the help of an class name.static varible belongs to the class not an object.
// }



//case-2
//static varible is mainly use for memeory management
//When a varible is declared as static then a single copy of varible is created and shared among all objects at class level.Thus company name i.e.ACI will be shared among e1,e2 and all the objects.

// public class StaticVarible {
//     int empid;
//     String name;
//    static String company="ACI";
//     StaticVarible(int empid,String name){
//         this.empid=empid;
//         this.name=name;
//     }
//     void display() {
//         System.out.println("Employee id : "  + empid +  "Name :"  + name +  "Company :"  + company);
//     }
//     public static void main(String[] args) {
//         StaticVarible e1=new StaticVarible(101, "vigor");
//         e1.display();
//         StaticVarible e2=new StaticVarible(102,"john");
//         e2.display();
// }  //The static varibe can be used to refer to the common property or value for all objects for example, company name of employees college name of students etc.
// }//the static varible gets memory only once in the class area at the time of class loading.


public class StaticVarible {
    static int count=0;
    StaticVarible(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        StaticVarible c1= new StaticVarible();
        StaticVarible c2= new StaticVarible();
        StaticVarible c3= new StaticVarible();
       
    }
}//When we create c1 object ,constructor will be called and the value of count become 1 ,when we create c2 object, agin constructor will be called and count value become 2 then 3 and so on whenever we craete  new object.