import java.util.*;
public class Areas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        System.out.println("The area of the circle is:"+(3.14*r*r));

        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The area of the triangle is:"+(0.5*l*b));
        System.out.println("The area of the rectangle is:"+(l*b));

        int d1=sc.nextInt();
        int d2=sc.nextInt();
        System.out.println("The area of the rhombus is:"+(0.5*d1*d2));

        int h=sc.nextInt();
        System.out.println("The area of the parallelogram is:"+(l*h));

        int a=sc.nextInt();
        System.out.println("The area of the equilateral triangle is:"+(1.732/4)*a);


    }
}
