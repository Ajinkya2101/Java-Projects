import java.util.Scanner;

public class FannysOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        System.out.println("Enter a string");
        String input = sc.nextLine();
        System.out.println("Enter the character to be removed");
        String rem = sc.nextLine();

        String newString = input.replace(rem,a);
        System.out.println(newString.toCharArray());

    }
}
