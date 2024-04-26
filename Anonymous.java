public class Anonymous {
    static void test(int[] num) {
      int total=0;
      for(int i:num){
        System.out.println("Value of i is : "+i);
        total+=i;
      }
      System.out.println("Value of i is : "+total);
    }
    public static void main(String[] args) {
        Anonymous.test(new int[]{10,30,50});
    }
}
