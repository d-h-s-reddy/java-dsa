import java.util.*;
public class fibanocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int prev=0;
        int next=1;
        System.out.println(prev);
        System.out.println(next);
        for(int i=1;i<n;i++){
            c=next+prev;
            System.out.println(c);
            prev=next;
            next=c;
            c=0;
        }
    }
    
}
