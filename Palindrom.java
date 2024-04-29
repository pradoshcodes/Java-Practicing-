public class Palindrom {
    public static void main(String[] args) {
        int num=121;
    int temp=num;
    int rev=0,rem;
    while(temp!=0){
   rem=temp%10;
   rev=rev*10+rem;
   temp/=10;  

    }
    if(num==rev){
        System.out.println(num+":The number is a palindrome");
    }else{
        System.out.println(num+":The number is  not a palindrome");
    }
    }
}
