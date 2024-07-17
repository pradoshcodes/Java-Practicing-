import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx  {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(31);
        list.add(21);
        list.add(53);
        list.add(20);
        list.add(69);
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);

    }
}
