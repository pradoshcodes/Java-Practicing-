abstract class Abstract {
    abstract void display();
}
class  Concrete extends Abstract{
    
     void display() {
        System.out.println("This is the concrete implementation of the abstract method");
    }
}
    class  InnerClass extends Abstract {
        
     void display() {
            System.out.println("This is an inner class implementing the abstract method from its outer class.");
        }
        public static void main(String[] args) {
            Concrete  c = new Concrete();
            c.display(); // calling the outer

            InnerClass in=new InnerClass();
            in.display();
        }
    }

