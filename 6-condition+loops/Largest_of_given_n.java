import java.util.*;
public class Largest_of_given_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        int n=sc.nextInt();
        while(n!=0){
            if(n>max){
                max=n;
            }
            n=sc.nextInt();
        }
        System.out.println("The largest of the given n numbers is:"+max);
    }
}
