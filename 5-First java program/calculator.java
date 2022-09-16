import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=s.nextInt();
        System.out.print("Enter the second number:");
        int b=s.nextInt();
        System.out.print("Enter the preferred operator:");
        char o=s.next().charAt(0);
        if(o == '+'){
            System.out.println("The sum is:"+(a+b));
        }
        else if(o =='-'){
            System.out.println("The difference is:"+(a-b));
        }
        else if(o =='*'){
            System.out.println("The multiplication is:"+(a*b));
        }
        else{
            System.out.println("The division is:"+(a/b));
        }

    }
    
}
