import java.util.ArrayList;
import java.util.*;
public class ArrayList {

    public static void main(String[] args) {
        ArrayList al=new ArrayList();//Accept all data types value
        // ArrayList<String> al=new ArrayList<String>();//allowed only string
          List al1=new ArrayList();//how to add individuals values to array
          al1.add(true);
          al1.add(false);
          al.add(10);
          al.add("twenty");
          al.add(true);
          al.addAll(al1);//how to add collection object 
          System.out.println(al);
          System.out.println(al1);
          System.out.println(al.size());//to find the size of the arraylist
          System.out.println(al.get(1));//If you want specific value
          System.out.println(al.contains(10));//searching element we use contain
          System.out.println(al.isEmpty());//Reading ArrayList values
         


    }
}