import java.util.Scanner;
import static java.lang.System.in;

public class FibonacciSeries {
    public static void main(String[] args){
        int f0 = 0, f1 = 1, f2;
        Scanner sc = new Scanner(in);
        int range = sc.nextInt();
        System.out.print(f0+"\t\t"+f1);
        for (int i = 3; i <= range; ++i){
            f2 = f0 + f1;
            System.out.print("\t\t"+f2);
            f0 = f1;
            f1 = f2;
        }
    }
}
