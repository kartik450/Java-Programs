import java.util.*;
public class Swapping_of_two_numbers
{
    public static void main(String[] args) {
        int a;
        int b;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=obj.nextInt();
        System.out.print("Enter second number: ");
        b=obj.nextInt();
        System.out.println("Before swapping:-\na = "+a+"\nb = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After swapping:-\na = "+a+"\nb = "+b);
    }
}
