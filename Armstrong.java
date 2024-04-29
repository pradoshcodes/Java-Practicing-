
public class Armstrong {
  public static void main(String[] args) {
    int n=152,length=0;
    int t1=n;
    while(t1!=0){
        length=length+1;
        t1=t1/10;
      
    }
    int t2=n,rem;
    int arm=0;
    while (t2!=0) {
        int mul=1;
        rem=t2%10;
        for(int i=1;i<=length;i++){
            mul=mul*rem;
               
    }
    arm=arm+mul;  
    t2=t2/10;      


  }
if (n==arm){
    System.out.println("Number  is an Armstrong number");
    }else{
      System.out.println("Number is not an Armstrong number");
     }
}
}

    
