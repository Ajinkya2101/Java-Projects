import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class LengthOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        double n = sc.nextInt();
        double count = 0;
        while (n>0){
            n = n/10;
            ++count;
        }
        out.println(count);
    }
}
