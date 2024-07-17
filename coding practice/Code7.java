//Fibonnaci series
public class Code7 {
    public static void main(paranthesisChecker[] args) {
        int n1=0;
        int n2=1;
        int sum;
        System.out.print(n1+" "+n2);
        for(int i=2;i<10;i++){
            
            sum=n1+n2;
            System.out.print(" "+sum+" ");
            n1=n2;
            n2=sum;
        }
       
    }
}
