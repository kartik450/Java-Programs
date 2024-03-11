import java.util.*;
import java.lang.String;
class Addition{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a=ob.nextFloat();
        System.out.print("Enter second number: ");
        float b=ob.nextFloat();
        float c=a+b;
        System.out.print("Sum = "+c);
    }
}