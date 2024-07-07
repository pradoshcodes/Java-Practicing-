//Find the missing number in array

import java.util.Scanner;

public class Code13 {
  public static void main(String[] args) {
    // int[] arr = {1,2,4,5};
    // int n = arr.length+1;
    // int sum = (n*(n+1))/2;
    // int sum1 = 0;
    // for(int i=0;i<arr.length;i++){
    //     sum1 = sum1+arr[i];
    //     }
    //     System.out.println(sum-sum1);
        

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            }
            int sum1=(n*(n+1))/2;
            System.out.println(sum1-sum);
            }
            
  }  

