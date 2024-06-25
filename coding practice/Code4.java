//Reverse string
public class Code4 {
    public static void main(String[] args) {
        String str = "Hello World";
        String rev="";
        // for(int i=str.length()-1;i>=0;i--){
        //     rev=rev+str.charAt(i);

        // }
        // System.out.println(rev);


        //Using character array
        // char a[]=str.toCharArray();
        // for(int i=a.length-1;i>=0;i--){ 
        //     System.out.print(a[i]);
        // }

        //Using String Buffer class
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
