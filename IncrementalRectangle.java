import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class IncrementalRectangle {
    public static void main(String[] args){
        out.println("Enter number of rows and columns: ");
        Scanner scPattern = new Scanner(in);
        int n = scPattern.nextInt();

        for (int i=1; i <= n; i++){
            for (int j=1; j <= 4; j++){
                out.print(i+"\t");
            }
            out.print("\n");
        }
    }
}
