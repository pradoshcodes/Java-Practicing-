 class MethodOverriding {
     void show(){
        System.out.println("This is the base method");
     }
}

  class Overrides extends MethodOverriding {
   
   void show(){
      System.out.println("This is an child method");
   }
   public static void main(String[] args) {
      MethodOverriding obj = new MethodOverriding();
      obj.show();

      Overrides o=new Overrides();
      o.show();
   }
}
//Method Overrideing allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclass or parent classes.This implementation in the subclass overrides the implementation in the superclass by providing a method that has same name, same parameters or signature and same return type as the method in the parent class. 



//case-1
//Do overriding must have same return type(or subtype)?
//From java 5.0 onwards it is possible to have different return type for a overriding method in child class ,but child return type shuld be sub-type of parent return type.This phenomena is known as covariant return type.
// class MethodOverriding {
//    Object show(){
//       System.out.println("This is the base method");
//       return null;
//    }
// }
// class Overrides extends MethodOverriding {
 
//  String show(){
//     System.out.println("This is an child method");
//     return null;
//  }
//  public static void main(String[] args) {
//     MethodOverriding obj = new MethodOverriding();
//     obj.show();

//     Overrides o=new Overrides();
//     o.show();
//  }
// }

//case-2
//The access modifier for an overriding method can allow more but not less,access than the overridden method.for example a protected instance method inthe super class can be made public but not private in the subclass.Doing so,will generate compile-time error.
// class MethodOverriding {
//    public Object show(){//default, protected,public
//       System.out.println("This is the base method");
//       return null;
//    }
// }
// class Overrides extends MethodOverriding {
 
//  public String show(){
//     System.out.println("This is an child method");
//     return null;
//  }
//  public static void main(String[] args) {
//     MethodOverriding obj = new MethodOverriding();
//     obj.show();

//     Overrides o=new Overrides();
//     o.show();
//  }
// }


//case-3
//final method can not be overriden?
//if we donot want a method to be overridden ,we declare it as final.
// class MethodOverriding {
//    final void show(){//default, protected,public
//       System.out.println("This is the base method");
//    }
// }
// class Overrides extends MethodOverriding {
 
//   void show(){
//     System.out.println("This is an child method");
//  }
//  public static void main(String[] args) {
//     MethodOverriding obj = new MethodOverriding();
//     obj.show();

//     Overrides o=new Overrides();
//     o.show();
//  }
// }





//Static method can not be overridden?
//when you defines a static method with same signature as a static method in base class,it is known as method hiding.
// class MethodOverriding {
//    static void show(){//default, protected,public
//       System.out.println("This is the base method");
//    }
// }
// class Overrides extends MethodOverriding {
 
//   void show(){
//     System.out.println("This is an child method");
//  }
//  public static void main(String[] args) {
//     MethodOverriding obj = new MethodOverriding();
//     obj.show();

//     Overrides o=new Overrides();
//     o.show();
//  }
// }



//private method can not be overridden?
//private method can not be overridden as they are bonded during compile time.Threrfore we can not even override private method in a subclass.
// class MethodOverriding {
//    private void show(){//default, protected,public
//       System.out.println("This is the base method");
//    }
// }
// class Overrides extends MethodOverriding {
 
//   void show(){
//     System.out.println("This is an child method");
//  }
//  public static void main(String[] args) {
//     MethodOverriding obj = new MethodOverriding();
//     obj.show();

//     Overrides o=new Overrides();
//     o.show();
//  }
// }