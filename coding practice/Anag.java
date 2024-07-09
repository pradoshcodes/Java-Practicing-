//How to check whether number is anagrams or not
public class Anag {

    private static Boolean isAnagram(String string, String string2) {
        int[] count=new int[256];
        for(int i=0;i<string.length();i++){
            count[string.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                System.out.println("Not anagrams");
                return false;
                    }
                  
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println( isAnagram("aab","baa"));
     }
}
