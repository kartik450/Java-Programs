import java.util.*;
public class Division {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter dividend: ");
        float a=ob.nextFloat();
        System.out.println("Enter divisor: ");
        float b=ob.nextFloat();
        float c=(a/b);
        System.out.println("The division is: "+c);
    }
}
