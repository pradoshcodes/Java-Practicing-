import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareEx3 {
  public static void main(String[] args) {
    Myclass mc=new Myclass("Vigor", 21);
    Myclass mc1=new Myclass("Abhaya", 22);
    Myclass mc2=new Myclass("Dinesh", 25);
    Myclass mc3=new Myclass("Harish", 27);

    List<Myclass> ls=new ArrayList<>();
    ls.add(mc);
    ls.add(mc1);
    ls.add(mc2);
    ls.add(mc3);
    Collections.sort(ls,(a,b)->b.id-a.id);
    System.out.println(ls);


  }    
}

class Myclass{
    String name;
    int id;

    public Myclass(String name,int id){
        this.name=name;
        this.id=id;

    }

    public String toString(){
        return "name="+name+"id="+id;
    }
}
