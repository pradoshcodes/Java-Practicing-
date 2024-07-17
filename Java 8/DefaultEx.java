interface A{
    default void say(){
        System.out.println("Hello java");
    }

}
interface B{
    default void say(){
        System.out.println("Hello java8");
    }
}


public class DefaultEx implements A,B{
 
    public static void main(String[] args) {
        DefaultEx c = new DefaultEx();
        c.say();
    }
    @Override
    public void say(){
        System.out.println("Hello java9");
        A.super.say();
    }
   
}
