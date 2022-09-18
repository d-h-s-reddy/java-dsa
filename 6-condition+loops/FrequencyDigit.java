import java.util.*;
public class FrequencyDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int count=0;
        int rem=0;
        // while(n>0){
        //     while(n%10==a){
        //         count++;
        //         n=n/10;
        //     }
        //     n=n/10;
        // }
        while(n>0){
            rem=n%10;
            if(rem==a){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);   
    }
}
