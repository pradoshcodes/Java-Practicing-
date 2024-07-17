import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumeEx {
    public static void main(String[] args) {
        Consumer<List<Integer>> lc=li->{
            for (Integer i : li) {
                System.out.println(i+100);
            }
        };
        Consumer<List<Integer>> lc1=li->{
            for (Integer i : li) {
                System.out.println(i);
            }
        };
        Consumer<List<Integer>> liscon=lc.andThen(lc1);
        liscon.accept(Arrays.asList(1,2,3,4));
    }
}
