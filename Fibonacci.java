public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1;
        System.out.print(n1+" "+n2);
        int sum;
        for(int i=1;i<15;i++){
            sum=n1+n2;
            System.out.print("  "+sum);
            n1=n2;
            n2=sum;
        }
    }
}
