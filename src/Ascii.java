import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = ob.next().charAt(0);
        int b=(int) a;
        System.out.print("Ascii value of " + a + " is: " + b);
    }
}
