import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<Integer> sup=()->100;
        System.out.println(sup.get());
    }
}
