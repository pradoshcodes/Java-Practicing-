/**
 * InnerStaticEx
 */
 interface InnerStaticEx {
static void say(){
    System.out.println("InnerStaticEx.say()");
}
    
}

public class StaticEx implements InnerStaticEx {
public static void main(String[] args) {
    InnerStaticEx.say();
}
    
}
