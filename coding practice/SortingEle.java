import java.util.Arrays;

public class SortingEle {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        System.out.println("Array Element Before Sorting:"+Arrays.toString(arr));
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array Element after Sorting:"+Arrays.toString(arr));
    }
}
