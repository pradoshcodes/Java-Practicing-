interface Demo{
    String name();
    int id();
}
// class Student implements Demo{
//   public String name(){
//     return "Rahul";
//   }  
//   public int id(){
//     return 1;
//     }
// }

public class AnonymousEx {
    public static void main(String[] args) {
        Demo d = new Demo(){
       public String name(){
       return "Rahul";
       }  
       public int id(){
         return 1;
         }
        };
    
        System.out.println(d.name());
    }
}
