public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {45, 23, 16, 97, 89};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
    
        }
for(int  k:arr){
    System.out.print("Pass:");
    System.out.println(k + " ");
}
     }
 }


