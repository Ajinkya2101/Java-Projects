import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ArmstrongAnyNo {
    public static void main(String[] args){
        double n, sum = 0;
        Scanner sc = new Scanner(in);
        out.println("Enter a number to check if it is an Armstrong Number:");
        n = sc.nextInt();
        int temp_1 = (int) n;
        int temp_2 = (int) n;
        int count = 0;
        while (temp_1>0){
            temp_1 = temp_1 / 10;
            ++count;
        }
        out.println(count+" --> Count");

        while (temp_2 > 0){
            double rem = temp_2 % 10;
            sum = sum + (Math.pow(rem, count));
            temp_2 = temp_2 / 10;
        }
        if (n == sum){
            out.println("Armstrong");
        }
        else {
            out.println("Not Armstrong");
        }
    }
}
