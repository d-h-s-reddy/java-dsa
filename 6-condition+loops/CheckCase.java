import java.util.*;
public class CheckCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().trim().charAt(0);
    //the trim function is used to remve the spaces in front of the string and the end of the string
        if(c>='a' && c<='z'){
            System.out.println("Lower case letter is inputed");
        }else{
            System.out.println("Upper case is inputed");
        }

    }
    
}
