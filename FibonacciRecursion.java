
public class FibonacciRecursion {
    static int n1=0,n2=1,n3;
public static void main(String[] args) {
    System.out.println(n1+ " "+ n2); 
    FibonacciRecursion fr=new FibonacciRecursion();
    fr.sum(10);
    }
    
     void sum(int i){
        if(i>=1){
            n3=n1+n2;
            System.out.print("  "+n3);
            n1=n2;
            n2=n3;
            sum(i-1);
        }
}
}

    
