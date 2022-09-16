import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int size=s.length();
        boolean flag=false;
        for(int i=0;i<(size/2);i++){
            if(s.charAt(i)==s.charAt(size-1-i)){
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("The given string is a palindrone");
        }
        else{
            System.out.println("The given string is not a palindrone");
        }

    }
    
}
