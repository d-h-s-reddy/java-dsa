import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not");
        int a=inp.nextInt();
        int counter=2;
        if(a<=1){
            System.out.println("neither prime nor composite");
            return;
        }
        else{
            if(a==4){
                System.out.println("not a prime number");
            }
            else{
                while((counter*counter)<=a){
                    if(a%counter==0){
                        System.out.println("Given number is not a prime number");
                        return;
                    }
                    counter=counter+1;
                }
                if((counter*counter)>a){
                    System.out.println("Given number is a prime number");
                }
            }

        }
    }
}