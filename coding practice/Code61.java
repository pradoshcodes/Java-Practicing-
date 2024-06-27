//count even and odd digits
public class Code61 {
    public static void main(String[] args) {
        int n=1234;
        int count_even=0;
        int count_odd=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                count_even++;
                }else{
                    count_odd++;
                }
                n=n/10;
            }
            System.out.println("Even digits are "+count_even);
            System.out.println("Odd digits are "+count_odd);
        }

    }

