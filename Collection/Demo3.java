import java.util.LinkedList;
public class Demo3 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        System.out.println("Linked List: "+ll);
        ll.addFirst("Z");
        System.out.println("Linked List after adding at first: "+ll);
        ll.addLast("Y");
        System.out.println("Linked List after adding at last: "+ll);
        
    }
}
