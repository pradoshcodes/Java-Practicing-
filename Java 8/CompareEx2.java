import java.util.Map;
import java.util.TreeMap;

public class CompareEx2 {
    public static void main(String[] args) {
        Map<Integer,String> mp=new TreeMap<>();
        mp.put(2, "y");
        mp.put(3, "f");
        mp.put(1, "z");
        System.out.println(mp);
        Map<Integer,String>mm=new TreeMap<>((a,b)->b-a);
        mm.put(6, "f");
        mm.put(4, "u");
        mm.put(5, "c");
        System.out.println(mm);
    }
}
