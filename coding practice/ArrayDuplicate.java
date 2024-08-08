import java.util.HashSet;

public class ArrayDuplicate {
    public static void main(String[] args) {
        String arr[]={"java","Javascript","python","HTML","CSS","java"};
        Boolean flag=false;
        HashSet<String> hs=new HashSet<>();
        for(String l:arr){
            if(hs.add(l)==false){
                System.out.println("Dupliacte elemetn is found"+""+l);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("No duplicate element");
        }
    //     Boolean flag=false;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 System.out.println("Duplicate Element found"+""+arr[j]);
    //                 flag=true;
    //             }
            
            
    //         }
    //     }
    //     if (flag==false) {
    //         System.out.println("Element is not found");
    //     }
     }
}
