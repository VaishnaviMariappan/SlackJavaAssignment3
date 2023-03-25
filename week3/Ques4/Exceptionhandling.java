import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptionhandling{
    public static void main(String[] args) {
        try {
            int a,b;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException err){
            System.out.println("Cannot be divided by zero");
        }
        catch(InputMismatchException err){
            System.out.println(err);
        }

    }
}