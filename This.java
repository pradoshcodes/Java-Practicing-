// public class This {
//     int i;
//     void setvalue(int x){
//        i=x;
//     }
//     void show(){
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         This t = new This();
//         t.setvalue(50);
//         t.show();
//     }
// }

//if we use "i" instead of "x" 

// public class This {
//     int i;
//     void setvalue(int i){
//        i=i;
//     }
//     void show(){
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         This t = new This();
//         t.setvalue(50);
//         t.show();
//     }
// }//It print default value(that is 0) if we give the same name to instance varible(i) and also to the local varible(i).To avoid this problem we use "this" keyword.

public class This {
    int i;
    void setvalue(int i){
       this.i=i;
    }
    void show(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        This t = new This();
        t.setvalue(50);
        t.show();
    }
}//it shows output:50 because this keyword referers to the current class instance varible.