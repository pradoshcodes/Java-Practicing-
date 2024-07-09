//How to find duplicate in array

import java.util.HashSet;

public class Code16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,3};

        HashSet<Integer> hs=new HashSet<Integer>();
        for (Integer In : arr) {
           System.out.println("Array duplicate element is:"+ hs.add(In));
        }
        
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 System.out.println("Array duplicate elments is:"+arr[i]);
    //             }
    //     }
    // }
}
}
