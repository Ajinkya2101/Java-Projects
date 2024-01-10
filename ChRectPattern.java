import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ChRectPattern {
    public static void main(String[] args){
        out.println("Enter number of rows: ");
        Scanner scPattern = new Scanner(in);
        char n = 65;
        for (int i=1; i <= 5; i++){
            for (int j=1; j <= 5; j++){
                out.print("\t"+n);
                n++;
            }
            out.print("\n");
        }
    }
}
