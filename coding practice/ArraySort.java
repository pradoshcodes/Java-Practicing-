import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = { 30,20,50,80,10,90};
        System.out.println("Array element before sorting:"+Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println("Array element after sorting:"+Arrays.toString(arr));
        System.out.println("Array element before sorting:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array element after sorting:"+Arrays.toString(arr));

        Integer[] arr2 = { 30,20,50,80,10,90};
        System.out.println("Array element before sorting:"+Arrays.toString(arr2));
        Arrays.sort(arr2,Collections.reverseOrder());
        System.out.println("Array element after sorting:"+Arrays.toString(arr2));
    }
}
