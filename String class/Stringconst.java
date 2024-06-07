// //1 - public String(){}
// // public class Stringconst {

// //     public static void main(String[] args) {
// //         String s=new String();
// //         System.out.println(s.length());
// //     }
// // }//here it creates an empty object





// //2 - public String(string s){}
// // public class Stringconst {

// //     public static void main(String[] args) {
// //         String s=new String("vigor");
// //         System.out.println(s.length());
// //     }
// // }



// //public String(StringBuffer sb){}
// public class Stringconst {

//     public static void main(String[] args) {
//         StringBuffer s=new StringBuffer("vigor");
//         String s1=new String(s);
//         System.out.println(s1);
//     }
// }

// //public String(StringBuilder sb){}
// public class Stringconst {

//     public static void main(String[] args) {
//         StringBuilder s=new StringBuilder("vigor");
//         String s1=new String(s);
//         System.out.println(s1);
//     }
// }
// //public String(char[] ch){}
// public class Stringconst {

//     public static void main(String[] args) {
//        char[] c={'a','b','c'};
//         String s1=new String(c);
//         System.out.println(s1);
//     }
// }
// //public String(byte[] b){}
// public class Stringconst {

//     public static void main(String[] args) {
//        byte[] b={101,102,203,302};
//         String s1=new String(s);
//         System.out.println(s1);
//     }
// }




//Why we are using char array to store password in java
public class Stringconst {

    public static void main(String[] args) {
       char[] c=new char[]{'a','b','c'};
       String s2=new String("abc");
        System.out.println(c);
        System.out.println(s2);
    }
    }//String objects are immutable in java and therefore if a password is stored as plain text it will be available in memory until garbage collector clears it,but string objects are stored in string literals pool for reusability and garbage collection is not appliacable in SCP , which is a security threat.with an array ,you can explicitly wipe the data after you are done with it.you can overwrite the array with anything you like and the password won't be present anywhere in the system,even before garbage collection.
