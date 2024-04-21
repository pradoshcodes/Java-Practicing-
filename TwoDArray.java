// public class TwoDArray {
//     public static void main(String[] args) {
//         int[][] arr = {{10,20,30},{60,70},{40,80,90}};
//         System.out.println("Two-Dimensional Array: "+arr);
//         System.out.println("Two-Dimensional Array: "+arr[0]);
//         System.out.println("Two-Dimensional Array: "+arr[0][0]);
//         System.out.println("Two-Dimensional Array: "+arr.length);
//         System.out.println("Two-Dimensional Array: "+arr[0].length);
//     }
//     }
       

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{60,70},{40,80,90}};
        for(int i=0;i<=arr.length;i++ ){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}