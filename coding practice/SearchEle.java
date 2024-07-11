//Searching an element in array
public class SearchEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,10};
        int ele = 10;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if (ele==arr[i]) {
                System.out.println("Element is found:"+i);
                flag=true;
              
            }
            }
            if(flag==false){
            System.out.println("Element is not found");
        }
    }
}

