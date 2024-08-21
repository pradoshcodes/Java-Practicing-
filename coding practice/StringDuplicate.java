import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {
    
    public static void main(String[] args) {
        String str = "java";
        System.out.println("after removing duplicates from string :"+remove(str));
    }

    public static String remove(String str){
        Set<Character> set=new HashSet<>();
        StringBuffer sf=new StringBuffer();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                sf.append(ch);
            }
        }

        return sf.toString();
    }
}
