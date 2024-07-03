import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int fact=1;
        for(int i=sum;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}