import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        // Function<String,Integer> fun=x->x.length();
        // System.out.println(fun.apply("Vipul"));//

        // Function<String, String> function1=s-> s.toUpperCase();
        // Function<String,String> function2=s-> s.substring(0,3);
        // System.out.println(function1.andThen(function2).apply("Vipul"));

        // Function<Integer,Integer> fun1=x->x*2;
        // Function<Integer,Integer> fun2=x->x*x*x;
        // System.out.println(fun1.andThen(fun2).apply(3));
        // System.out.println(fun2.andThen(fun1).apply(3));
        // System.out.println(fun1.compose(fun2).apply(3));
        // System.out.println(fun2.compose(fun1).apply(3));

        Function<String, String>identify=Function.identity();
        System.out.println(identify.apply("Vipul"));
    }
}
