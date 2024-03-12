import java.util.*;
public class Quotient_Remainder
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int a=ob.nextInt();
        System.out.print("Enter divisor: ");
        int b=ob.nextInt();
        int q=a/b;
        int r=a-(b*q);
        System.out.println("Quotient: "+q);
        System.out.print("Remainder: "+r);
    }
}
