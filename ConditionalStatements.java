import java.util.*;
public class ConditionalStatements {

    public static void main(String[] args) {
        boolean b = true;

        while (b) {
            Scanner sc = new Scanner(System.in);

            System.out.print("""
                    \s
                     Press '1' for Days of week\s
                     Press '2' for Months in a year\s
                     Press '3' to exit
                    """);

            int user_input = Integer.parseInt(sc.next());

            if (user_input == 1) {
                weeks();
            }
            else if (user_input == 2) {
                year();
            }
            else if (user_input == 3){
                b = false;
            }
            else {
                System.out.println("Enter a valid number\n");
            }
        }
    }

    private static void weeks() {
        System.out.println("Enter a number between 1 to 7\n");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        switch (number){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
        }
    }

    private static void year() {
        System.out.println("Enter a number between 1 to 12\n");
        Scanner sc = new Scanner(System.in);
        int number_years = Integer.parseInt(sc.next());
        switch (number_years){
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("December");
            break;
        }

    }
}
