
import java.util.ArrayList;
public class Demo2 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	
	al.add(100);
	al.add("vigor");
	al.add('c');
	System.out.println(al);
	

	
	ArrayList al2=new ArrayList();
	al2.add(200);
	al2.add("pradosh");
	al2.add('c');
	System.out.println(al.removeAll(al2));//It removes the array common elements from the First arraylist
	System.out.println(al);
	System.out.println(al2);
	al2.clear();//use to clear all the elements from the arraylist
	System.out.println(al2);
	
//	System.out.println(al.add("aaa"));//if element is succesfully add in collection object it show boolean value 
//	System.out.println(al);
//	System.out.println(al.contains(100));//if the arraylist contain the value you give then it return true  otherwise it return false
//    System.out.println(al.isEmpty());//if the arraylist is empty it return true otherwise it return false
//    System.out.println(al.size());//it return the size of an arraylist
//	System.out.println(al.remove(0));//if you write like al.remove(100) it gives you "IndexOutOfBoundException" .so give the index value then it delete the value from your index
//	ArrayList al2=new ArrayList();
//	al2.add("pradosh");
//	al2.add("bbb");
//	al2.add("ccc");
//	System.out.println(al2);
//	
//	
//	al.addAll(al2);
//	System.out.println(al);
}
}


