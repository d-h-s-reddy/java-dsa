import java.util.*;
public class npr_and_ncr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int product=1;
        int nr=1;
        int rr=1;
        float npr=0;
        float ncr=0;
        for(int i=1;i<=n;i++){
            product*=i;
        }
        for(int i=1;i<=(n-r);i++){
            nr*=i;
        }
        for(int i=1;i<=r;i++){
            rr*=i;
        }
        System.out.println("The npr of the given values is:"+(product)/(nr));
        System.out.println("The ncr of the given value is:"+(product)/(nr*r));
    }  
}
