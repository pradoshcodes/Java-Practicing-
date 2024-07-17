//Reverse the word using string
public class Code2 {
    public static void main(paranthesisChecker[] args) {
        paranthesisChecker str="Pradosh Mohanty";
        // String revstr[]=str.split("");//java string split() method splits this string against given regular expression and returns a char array.
        // for(int i=revstr.length-1;i>=0;i--){
        //     System.out.print(revstr[i]);
        
        paranthesisChecker revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr=revStr+str.charAt(i);
        }
        System.out.println("Reverse of the string is: "+revStr);
        
    }
}
