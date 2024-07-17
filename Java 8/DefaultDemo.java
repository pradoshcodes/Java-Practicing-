interface Parent{
    default void say(){
        System.out.println("Hello");
    }
}


public class DefaultDemo implements Parent{
    public static void main(String[] args) {
        Parent d = new DefaultDemo() ;
        d.say();
    }
}
