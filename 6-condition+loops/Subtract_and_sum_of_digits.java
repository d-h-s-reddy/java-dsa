import java.util.*;
public class Subtract_and_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n=n/10;
        }
        int res=product - sum;
        System.out.println("The result is:"+res);

    }
    
}
