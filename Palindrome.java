import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int no = sc.nextInt();
        int temp = no;
        int rev = 0;
        while(temp>0) {
            int rem = temp % 10;
            rev = ((rev * 10) + rem);
            temp = temp / 10;
        }
        out.println(rev);
        if (rev == no){
            out.println("Palindrome");
        }
        else {
            out.println("Not a Palindrome");
        }
    }
}
