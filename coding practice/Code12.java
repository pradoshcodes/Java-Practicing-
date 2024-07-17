//check equality of an array
import java.util.Arrays;
import java.util.Scanner;
public class Code12 {
    public static void main(paranthesisChecker[] args) {
        // int[] a={10,20,30,40,50};
        // int[] b={10,2,30,40,50};
          
        // boolean check=Arrays.equals(a,b);
        // if (check == true) {
        //     System.out.println("Array are equals");
        // }else{
        //     System.out.println("Array are not equals");
        // }


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            }
            System.out.println("Enter the size of the array: ");
            int m=sc.nextInt();
            int[] b=new int[m];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < m; i++) {
                b[i]=sc.nextInt();
                }
                boolean check=Arrays.equals(a,b);
                if (check == true) {
                    System.out.println("Array are equals");
                    }else{
                        System.out.println("Array are not equals");
                        }
                        }
                        }

    
