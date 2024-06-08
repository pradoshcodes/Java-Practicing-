// public class Stringmethod3 {
//     public static void main(String[] args) {
//         String s1="rahul";
//         String s2="java";
//         System.out.println(s1+s2);
//         System.out.println(s1+10);
//         System.out.println(s1+10*20);
//         System.out.println(s1+20/10);
//         System.out.println(s1.concat(s2));
//         System.out.println(String.join(";",s1,s2));
//     }
// }


// public class Stringmethod3 {
//     public static void main(String[] args) {
//         String s1="this is demo";
        
//         System.out.println(s1.subSequence(3, 9));
//         System.out.println(s1.substring(3));
//         System.out.println(s1.substring(3,11));
//         System.out.println(s1.substring(3,11));
//     }
// }


public class Stringmethod3 {
    public static void main(String[] args) {
        String s1="this is demo";
        
        System.out.println(s1.replace("is", "was"));
        System.out.println(s1.replaceFirst("is","was"));
        System.out.println(s1.replaceAll("is","was"));
        System.out.println(s1.replaceAll("is(.)","was"));
        System.out.println(s1.replaceAll("is(.*)","was"));
    }
}