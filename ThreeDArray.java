public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] arr = { { { 10, 20, 30 }, { 40, 50, 90, 100 }, { 60, 70, 80 } } };
        // System.out.println("Two-Dimensional Array: "+arr);
        // System.out.println("Two-Dimensional Array: "+arr[0]);
        // System.out.println("Two-Dimensional Array: "+arr[0][0]);
        // System.out.println("Two-Dimensional Array: "+arr[0][0][0]);
        // System.out.println("Two-Dimensional Array: "+arr.length);
        // System.out.println("Two-Dimensional Array: "+arr[0].length);
        // System.out.println("Two-Dimensional Array: "+arr[0][0].length);
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }

                System.out.println();
            }
        }
    }
}
