 public class SingleInheritance {
    void first(){
        System.out.println("This is a parent class");
    }

    
}

 class Multi extends SingleInheritance{
    void second(){
        System.out.println("This is a child class method");
        
    }
    public static void main(String[] args) {
        Multi m = new Multi();
        m.first();
        m.second();
    
    }
}