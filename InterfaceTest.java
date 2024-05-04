//Interface are the blueprint of hte class.It specify what a class must do snd not how.
//It is used  to achieve abstraction.
//It supports multiple inheritance.
//it can be used to achieve loose coupling.
//  interface I1 {
//     void show();  
//  }    
//     //compiler add public by default 
    
// interface I1 {
// abstract void show();   
// }
// //if i use abstract it will be compile

// interface I1 {
//     public abstract void show();  
//  }//it will also compile

//  interface I1 {
//   protected abstract  void show();  
//  }//but if i use protected instead of public it will show"modifier protected not allowed here"

//  interface I1 {
//     default abstract  void show();  
//  }//we can not use default also it show error.


//  interface I1 {
//   void show();  
//   void display(){
   
//   }//it  will show error.

  
 

//   interface I1 {
//     void show();  
//     default void display(){
     
//     }//If i use default it will run.

//   }

//   interface I1 {
//     void show();  
//     default void display(){
     
//     }//If i use static  it will run.

//   }


// interface I1 {
   
//     public static final int a=10;
//     void show();

//   }//if you want to create a varible you have to use "public,static,final" otherwise it will show error.

interface I1 {
    void show();  
  }

  interface I2{
    void display();
  }
  class InterfaceTest implements I1
  {
      public void show(){
         System.out.println("Hello interface");
      }

      public void display(){
        System.out.println("it supports multiple inheritance");
      }
      public static void main(String[] args) {
        InterfaceTest t = new InterfaceTest();
        t.show();
        t.display();
      }
  }