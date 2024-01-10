import java.util.Scanner;

import static java.lang.System.*;

public class LoopingStatements {

    public static void main(String[] args) {

        boolean b = true;
        while (b) {
            Scanner sc = new Scanner(in);
            out.println("""
                     0. Enter '0' to Exit the code.
                     
                     1. Enter '1' to calculate the sum of n numbers
                     
                     2. Enter '2' to print tables of a number
                     
                     3. Enter '3' to print n number of rows and columns of '*' [Rectangle]
                     
                     4. Enter '4' to print hollow rectangle pattern using '*'
                     
                     5. Enter '5' to print pyramid pattern using '*'
                     *
                     **
                     ***
                                    
                     6. Enter '6' to print reverse pyramid pattern using '*'
                     ***
                     **
                     *
                     
                     7. Enter '7' to print inverse pyramid pattern using '*'
                       *
                      **
                     ***
                     
                     8. Enter '8' to print pyramid pattern:
                     1
                     12
                     123
                     
                     9. Enter '9' to print reverse pyramid pattern:
                     123
                     12
                     1
                     
                     10. Enter '10' to print Floyd's Triangle:
                     1
                     23
                     456
                     
                     11. Enter '11' to print 0-1 Triangle:
                     1
                     10
                     101
                     
                     Enter your choice:
                     \
                    """);
            int user_input = Integer.parseInt(sc.next());
            if (user_input == 1) {
                sumOfNumbers();
            } else if (user_input == 0) {
                b = false;
            } else if (user_input == 2) {
                tables();
            } else if (user_input == 3) {
                starPatternsRectangle();
            } else if (user_input == 4) {
                starPatternsHollowRectangle();
            } else if (user_input == 5) {
                starPatternsPyramid();
            } else if (user_input == 6) {
                starPatternsReversePyramid();
            } else if (user_input == 7) {
                starPatternInversePyramid();
            } else if (user_input == 8) {
                numberPyramidPattern();
            } else if (user_input == 9) {
                numberReversePyramidPattern();
            } else if (user_input == 10) {
                numberPyramidFloydsTriangle();
            } else if (user_input == 11) {
                numberPyramid01Triangle();
            }
        }
    }

    private static void sumOfNumbers() {
        int sum = 0;
        Scanner scSum = new Scanner(in);

        out.println("Enter the value of 'n' to calculate the sum of 'n' numbers: ");
        int n = scSum.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        out.println(sum);}

    public static void tables(){
        out.println("Enter a number to display it's table upto 10: ");
        Scanner scMul = new Scanner(in);
        int n = scMul.nextInt();

        for (int i = 1; i <= 10; i++){
            int table = n*i;
            out.println(table);

        }
    }

    private static void starPatternsRectangle() {
        out.println("Enter number of rows: ");
        Scanner scPattern = new Scanner(in);
        int n = scPattern.nextInt();

        for (int i=1; i <= n; i++){
            for (int j=1; j <= n; j++){
                out.print("*");
            }
        out.print("\n");
        }
    }

    private static void starPatternsHollowRectangle() {
        Scanner scHollowPattern = new Scanner(in);

        out.println("Enter number of rows: ");
        int rows = scHollowPattern.nextInt();
        out.println("Enter number of columns: ");
        int columns = scHollowPattern.nextInt();
        //Outer loop
        for (int i=1; i <= rows; i++){
            //Inner Loop
            for (int j=1; j <= columns; j++){
                //Cell --> (i,j)
                if (i == 1 || j == 1 || i == rows || j == columns){
                    out.print("*");
                }
                else {
                    out.print(" ");
                }
            }
            out.println();
        }
    }

    private static void starPatternsPyramid() {
        Scanner scPyramid = new Scanner(in);

        out.println("Enter the number of rows: ");
        int n = scPyramid.nextInt();

        for (int i=1; i <= n; i++){
            for (int j=1; j <= i; j++) {
                out.print("*");
            }
            out.println(" ");

        }
    }

    private static void starPatternsReversePyramid() {
        Scanner scPyramid = new Scanner(in);

        out.println("Enter the number of rows: ");
        int n = scPyramid.nextInt();

        for (int i=1; i <= n; i++){
            for (int j=n; j >= i; j--) {
                out.print("*");
            }
            out.println(" ");
        }
    }

    private static void starPatternInversePyramid() {
        Scanner scPyramid = new Scanner(in);
        out.println("Enter number of rows: ");
        int n = scPyramid.nextInt();

        for (int i=1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                out.print("*");
            }
            out.println();
        }
    }

    private static void numberPyramidPattern() {
        Scanner scNumberPyramid = new Scanner(in);
        out.println("Enter the number of rows: ");
        int n = scNumberPyramid.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                out.print(j+" ");
            }
            out.println();
        }

    }

    private static void numberReversePyramidPattern() {
        Scanner scReverseNumberPyramid = new Scanner(in);
        out.println("Enter the number of rows: ");
        int n = scReverseNumberPyramid.nextInt();
        for (int i=1; i <= n; i++){
            for (int j=1; j <= n-i+1 ; j++) {
                out.print(j);
            }
            out.println(" ");
        }
    }

    private static void numberPyramidFloydsTriangle() {
        Scanner scNumberPyramid = new Scanner(in);
        out.println("Enter the number of rows: ");
        int n = scNumberPyramid.nextInt();
        int initial = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                out.print(" "+initial);
                initial++;
            }
            out.println();
        }
    }

    private static void numberPyramid01Triangle() {
        Scanner scNumberPyramid = new Scanner(in);
        out.println("Enter the number of rows: ");
        int n = scNumberPyramid.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                int sum = i+j;
                if (sum % 2 == 0){
                    out.print("1 ");
                }
                else {
                    out.print("0 ");
                }
            }
            out.println();
        }
    }

}

