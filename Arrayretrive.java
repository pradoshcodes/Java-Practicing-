// public class Arrayretrive {
//     public static void main(String[] args) {
//         int[] arr={10,20,30,40,50};
//         for(int i=0;i<arr.length;i++){
//             System.out.println("Enter  the index of element to retrieve:"+arr[i]);
//         }
//     }
// }

public class Arrayretrive {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        for(int i:arr){
            System.out.println("Enter  the index of element to retrieve:"+i);
        }
    }
}