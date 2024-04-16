class Demo{
    void call1(){}

    static void call3(){}

}

class Y{
    
    static void call2(){
        new Demo().call1();
    }
}

// A static method can call non-static method inside and out side of a class by the help of an object