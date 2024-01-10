import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println(" 1. Tables \n 2. Sum of n numbers\n");
        int a = sc.nextInt();
        if (a == 1){
            tables();
        } else if (a == 2) {
            sumOfNumbers();

        }

    }

    public static void tables(){
        out.println("Displays table up to 10: ");

        for (int i = 1; i <= 10; i++) {
            out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%n", i, 2 * i, 3 * i, 4 * i, 5 * i, 6 * i, 7 * i, 8 * i, 9 * i, 10 * i);
        }
    }

    private static void sumOfNumbers() {
        int sum = 0;
        Scanner scSum = new Scanner(in);

        out.println("Enter the value of 'n' to calculate the sum of 'n' numbers: ");
        int n = scSum.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        out.println(sum);}
}
