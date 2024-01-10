import java.util.Scanner;
import static java.lang.System.*;
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(in);
        int sum = 0;
        out.println("Enter the numbers in array: ");
        for (int i = 0; i < 3; ++i) {
            int j = 0;
            int sum_row = sum + arr[i][j];
            out.println(sum_row);
            for (j = 0; j < 3; ++j) {
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
        }
        out.println("Sum of all elements: "+sum);
    }
}
