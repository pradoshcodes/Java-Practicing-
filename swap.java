public class swap {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
    //     int s=x;
    //    x=y;
    //    y=s;
    x=x+y;
    y=x-y;
    x=x-y;


        System.out.println("value of x :"+x);
        System.out.println("value of x :"+y);
    }
}
