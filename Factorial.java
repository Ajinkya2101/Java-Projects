import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Enter a number to find its factorial");
        int no = sc.nextInt();
        int fact = 1;
        while(no > 0){
            fact = fact * no;
            --no;
        }
        System.out.println(fact);
    }
}
