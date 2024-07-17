interface Demo{
     void show();
}

public class AnonymousEx2 {
    public static void main(String[] args) {
        something();
    }
    private static String something(){
        int a=2;
        Demo dm= ()->{
            int a=3;
            return;
        };
        System.out.println(Demo.show());
    }
}
