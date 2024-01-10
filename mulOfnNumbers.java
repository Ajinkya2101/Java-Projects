import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class mulOfnNumbers {
    public static void main(String[] args) {
        int mul = 1;
        Scanner scSum = new Scanner(in);

        out.println("Enter the value of 'n' to calculate the multiplication of 'n' numbers: ");
        int n = scSum.nextInt();

        for (int i = 1; i <= n; i++) {
            mul = mul * i;
        }
        out.println(mul);}
}
