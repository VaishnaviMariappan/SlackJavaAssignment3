import java.util.Scanner;

public class Example2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        MyCalculator n=new MyCalculator();
        System.out.println(n.divisor_sum(num)+"\n");
    }
}
