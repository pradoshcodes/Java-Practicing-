// import java.util.function.Predicate;

// public class PredicateAnd {
//     public static void main(String[] args) {
//         Predicate<String> p1 = x->x.toLowerCase().charAt(0)=='v';
//         Predicate<String> p2=x->x.toLowerCase().charAt(x.length()-1)=='l';
//         Predicate<String> and=p1.and(p2);
//         System.out.println(and.test("Vipul"));
//     }
// }
import java.util.function.Predicate;

public class PredicateNegate {
    public static void main(String[] args) {
        Predicate<String> p1 = x->x.toLowerCase().charAt(0)=='v';
        Predicate<String> p2=x->x.toLowerCase().charAt(x.length()-1)=='l';
        System.out.println(p1.negate().test("paplu"));
    }
}

// public class PredicateNegate {
//     public static void main(String[] args) {
//         Predicate<String> p1 = x->x.toLowerCase().charAt(0)=='v';
//         Predicate<String> p2=x->x.toLowerCase().charAt(x.length()-1)=='l';
//         Predicate<Object> predicate=Predicate.isEqual("Vigor");
//         System.out.println(predicate.test("Vigor"));

// public class PredicateOr {
//     public static void main(String[] args) {
//         Predicate<String> p1 = x->x.toLowerCase().charAt(0)=='v';
//         Predicate<String> p2=x->x.toLowerCase().charAt(x.length()-1)=='l';
//         Predicate<String> and=p1.and(p2);
//         System.out.println(and.test("Vipul"));
//     }
// }

