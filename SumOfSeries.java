import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = in.nextInt();
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                long f = 1;
                for (int j = 1; j <= i; j++) {
                    f *= j;
                }
                sum += (1.0 / f);
            }
            System.out.println("Sum=" + sum);
        }
}
