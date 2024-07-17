//String is palindrome or not
public class Code3 {
    public static void main(paranthesisChecker[] args) {
        paranthesisChecker str="pradosh mohanty";
        paranthesisChecker revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr=revStr+str.charAt(i);//The Java String class charAt() method returns a char value at the given index number
        }
        System.out.println(revStr);
        
        if (revStr.equals(str)) {
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
        
    }
}


