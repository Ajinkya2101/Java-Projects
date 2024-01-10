import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

//Three digit number
//Eg. 153 = (1^3) + (5^3) + (3^3)

public class Armstrong {
    public static void main(String[] args){
        int n, sum = 0, rem;
        Scanner sc = new Scanner(in);
        out.println("Enter a number to check if it is an Armstrong Number:");
        n = sc.nextInt();
        int nsave = n;
        while (n>0){
            rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n / 10;
        }
        if (nsave == sum){
            out.println("Armstrong");
        }
        else {
            out.println("Not Armstrong");
        }
    }
}
