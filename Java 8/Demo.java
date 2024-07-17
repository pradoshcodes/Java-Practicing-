
interface Hello {
default void say(){
    System.out.println("Hello World");
}
    
}

class Demo implements Hello{
    public void say(){
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.say();
}
}