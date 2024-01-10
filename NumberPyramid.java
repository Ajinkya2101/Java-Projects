import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class NumberPyramid {
    public static void main(String[] args){
        out.println("Enter number of rows: ");
        Scanner scPattern = new Scanner(in);
        int n = scPattern.nextInt();

        for (int i=1; i <= n; i++){
            for (int j=1; j <= i; j++){
                out.print("\t"+i);
            }
            out.print("\n");
        }
    }
}
