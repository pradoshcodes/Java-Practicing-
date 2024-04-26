public class MultilevelInheritance {
    void first(){
        System.out.println("This is the first method");
    }

}
class  Single extends MultilevelInheritance{
    void second(){
        System.out.println("This is the second method");
    }
}
class MultiLevel2 extends Single{
    void third() {
        System.out.println("This is the third method");
    }
    public static void main(String[] args) {
        MultiLevel2 obj = new MultiLevel2();
        obj.first();
        obj.second();
        obj.third();
    
    }
}
