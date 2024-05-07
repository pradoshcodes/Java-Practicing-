//super keyword is a reference varible which is used  to refer immediate parent class object.
public class Super {
    int a=10;
}

class This extends Super{
     int a=20;
     void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
     }
     public static void main(String[] args) {
        This th=new This();
        th.show(30);
     }
}
