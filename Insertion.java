public class Insertion {
    public static void main(String[] args) {
        int[] arr= {9, 8, 7,  6, 5,40,18,32}; 
        int temp,j;
        for(int i=0;i<arr.length;i++){
          temp=arr[i];
          j=i;
          while(j>0 && arr[j-1]>temp){
            arr[j]=arr[j-1];
            j=j-1;
          }
          arr[j]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Inserted element is "+arr[i]);
        }
    }
}
