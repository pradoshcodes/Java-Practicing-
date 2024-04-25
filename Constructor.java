//create using default constructor
// public class Constructor {

//     String name;
//     int emp_id;
//         public static void main(String[] args) {
//         Constructor c=new Constructor(); 
//         System.out.println(c.emp_id+"  "+c.name);
//     }
// }





// //create using no-arg constructor
// public class Constructor {
//     Constructor(){
//         System.out.println("No-arg constructor");
//     }
//         public static void main(String[] args) {
//         Constructor c=new Constructor(); 
//     }
// }



//create using parametrized constructor
public class Constructor {
    String name;
    int emp_id;
    Constructor(String name,int emp_id){
        this.name = name;
        this.emp_id = emp_id;
    } 
        public static void main(String[] args) {
        Constructor c = new Constructor("vigor",123);
        Constructor c1 = new Constructor("pradosh",102);
        System.out.println("Employee-1:"+c.name+ " "+ c.emp_id);
        System.out.println("Employee-2: " +c1.name+" "+c1.emp_id);

    }
}
