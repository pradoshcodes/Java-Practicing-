interface Demo{
    String show();
}

public class LambdaEx {
    public static void main(String[] args) {
        Demo d = () -> "Hello World";
        Demo d2 = () -> "Hello Java8";
        System.out.println(d.show());
        System.out.println(d2.show());
    }
    
}
