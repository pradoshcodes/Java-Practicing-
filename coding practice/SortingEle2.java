import java.util.Arrays;
import java.util.Collections;

public class SortingEle2 {
    public static void main(String[] args) {
        // int[] arr = {5, 2, 8, 1, 9};
        // System.out.println("Array Element before sorting:"+Arrays.toString(arr));
        // Arrays.parallelSort(arr);
        // System.out.println("Array Element after sorting:"+Arrays.toString(arr));

        //  int[] arr = {5, 2, 8, 1, 9};
        //  System.out.println("Array Element before sorting:"+Arrays.toString(arr));
        //  Arrays.sort(arr);
        //  System.out.println("Array Element after sorting:"+Arrays.toString(arr));


        Integer [] arr = {5, 2, 8, 1, 9};
         System.out.println("Array Element before sorting:"+Arrays.toString(arr));
         Arrays.sort(arr,Collections.reverseOrder());
         System.out.println("Array Element after sorting:"+Arrays.toString(arr));

    }
}
