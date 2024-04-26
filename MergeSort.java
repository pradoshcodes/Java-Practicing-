public class MergeSort {
    int [] array;
    int length;
    int[]  tempArray;
    public static void main(String[] args) {
        int[] arr= {34, 215,  67, 98, 101, 123};
        MergeSort m=new MergeSort();
        m.assign(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public void assign(int[] arr){
         this.array=arr;
         this.length=arr.length;
         this.tempArray = new int[length];
         divideArray(0, length-1);
    }
    public void divideArray(int si, int ei){
        if(si<ei){
            int mid = (si+ei)/2;
            divideArray(si,mid);
            divideArray(mid+1,ei);
            merge(si,mid,ei);
        }
        }
       public void merge(int si, int mid ,int ei){
        for(int i=si;i<=ei;i++){
            tempArray[i]=array[i];
        }
        int i=si;
        int j=mid+1;
        int k=si;
        while (i<=mid && j<=ei) {
            if(tempArray[i] <= tempArray[j]){
                array[k]=tempArray[i];
                i++;
            }else{
               array[k]=tempArray[j];
               j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = tempArray[i];
            i++;
            k++;
        }
    }
}
