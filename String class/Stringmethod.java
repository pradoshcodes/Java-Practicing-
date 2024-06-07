// public class Stringmethod {
//     public static void main(String[] args) {
//         String name="abc";//instead of name if you provide spaces the output will be valid.
//         int i=name.length();
//         if(i==0){
//             System.out.println("name is empty");
//         }
//         else{
//             System.out.println("valid name");
//         }
//     }
// }

// public class Stringmethod {
//     public static void main(String[] args) {
//         String name="abc";//instead of name if you provide spaces the output will be valid.
//         boolean b=name.isEmpty();
//         if(b==true){
//             System.out.println("name is empty");
//         }
//         else{
//             System.out.println("valid name");
//         }
//     }
// }


public class Stringmethod {
    public static void main(String[] args) {
        String name="     abc     ";//instead of name if you provide spaces the output will be valid.
        
        if(name.trim().isEmpty()){
            System.out.println("name is empty");
        }
        {
            System.out.println("valid name");
        }
}
}