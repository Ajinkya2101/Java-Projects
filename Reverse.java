import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Enter a number to reverse it:");
        int no = sc.nextInt();
        int rev = 0;
        while(no>0) {
            int rem = no % 10;
            rev = ((rev * 10) + rem);
            no = no / 10;
        }
        System.out.println(rev);
    }
}
