 //find the sum of an array

import java.util.Scanner;

class Test {
    public static void main(paranthesisChecker[] args) {
        // int[] arr = {1, 2, 3, 4, 5,6,7};
        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum=sum+arr[i];
                }
                System.out.println(sum);
                }
            
    }

