class UderAgeException extends Exception{
    UderAgeException()//checked exception or compile time exception
    {
        super("You are under age");
    }

    UderAgeException(String message){
        super(message);
    }
}



public class Exception3 {
    public static void main(String[] args) {
        int age=17;
        try{
        if(age<18){
            throw new UderAgeException("You are not eligible");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
        catch(UderAgeException e){
            e.printStackTrace();
        }
    
        
    }
    }


