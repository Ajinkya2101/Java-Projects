import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class RevStarPyramid {
    public static void main(String[] args) {
        Scanner scPyramid = new Scanner(in);

        out.println("Enter the number of rows: ");
        int n = scPyramid.nextInt();

        for (int i=1; i <= n; i++){
            for (int j=n; j >= i; j--) {
                out.print("*\t");
            }
            out.println(" ");
        }
    }
}
