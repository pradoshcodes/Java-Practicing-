//Encapsulation in java is a mechanism of wrapping the data and code acting on the data together as a single unit.
//step-1:Declare a variable of a class as a private.
//step-2:provide public setter and getter methods to modify and view the varible values.
public class Encapsulation {
    private int emp_id;// in encapsulation,the varible of a class will be hidden from other classes and
                      // can be accessed only through the method of their current class.This concept
                      // is known as Data Hiding.

    public void setEmpId(int empid){
        emp_id=empid;
    }  
    public int getEmpId(){
        return emp_id;
    } 
              }

  class Company{
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setEmpId(101);
        System.out.println(e.getEmpId());
    }
  }
