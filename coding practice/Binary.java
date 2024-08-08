public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8};
        int key=7;
        boolean flag=false;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                System.out.println("Element is found...");
                flag=true;
                break;

        }

        if(arr[mid]<key){
            l=mid+1;

        }

        if (arr[mid]>key) {
            h=mid-1;
        }


    }
    if(flag==false){
        System.out.println("Element is not Found...");
    }
}
}
