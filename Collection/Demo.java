import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(500);
        al.add(10);
        System.out.println("Reading ArrayList values using Iterator");
        Iterator i=al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());//get to the element and move to next element
        }
        Collections.sort(al);
        Collections.shuffle(al);

    }
}
