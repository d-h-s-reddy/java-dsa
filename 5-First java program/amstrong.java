import java.util.*;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0,r=0,index=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            while(n>0){
                r=n%10;
                sum=sum+(r*r*r);
                n=n/10;
            }
            if(sum==arr[i]){
                flag=true;
                index=i;
                break;
            }
            else{
                flag=false;
            }
        }
        if(flag==true){
            int a=arr[index];
            System.out.println("The amstrong number is:"+arr[index]);
            while(a>10){
                r=a%10;
                a=a/10;
            }
            System.out.println("The second number is:"+r);
        }
        else{
            System.out.println("there is no amstrong number");
        }
    }

    
}
