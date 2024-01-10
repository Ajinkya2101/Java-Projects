import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class SumOfnNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scSum = new Scanner(in);

        out.println("Enter the value of 'n' to calculate the sum of 'n' numbers: ");
        int n = scSum.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        out.println(sum);}
}
