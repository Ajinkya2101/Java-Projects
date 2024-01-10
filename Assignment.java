import java.util.Scanner;
public class Assignment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                    \s
                     Press '1' Marks\s
                     Press '2' Admission\s
                     Press '3' Weeks\s
                     Press '4' Vowels\s
                     Press '5' Leap Year
                     Press '6' Greatest Number\s
                     Press '7' Ascii\s
                     Press '8' Grading System
                     Press '9' Sales
                     
                    """);
        int user_input = Integer.parseInt(sc.next());

        if (user_input == 1) {
            Marks();
        }
        else if (user_input == 2) {
            Admission();
        }
        else if (user_input == 3){
            weeks();
        }
        else if (user_input == 4){
            Vowels();
        }
        else if (user_input == 5){
            Leap();
        }
        else if (user_input == 6){
            Greatest();
        }
        else if (user_input == 7){
            Ascii();
        }
        else if (user_input == 8){
            GradingSystem();
        }
        else if (user_input == 9){
            Discount();
        }
        else if (user_input == 10){
            Money();
        }
    }

    public static void Marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Paper 1: ");
        int a = sc.nextInt();
        System.out.println("Paper 2: ");
        int b = sc.nextInt();
        System.out.println("Paper 3: ");
        int c = sc.nextInt();

        int total;
        total = a + b + c;
        System.out.println("Total: "+total);
        int avg;
        avg = total/3;
        System.out.println("Average: "+avg);

        if (avg < 45){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
    public static void Admission(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gender: ");
        String g = sc.next();
        System.out.println("Paper 1: ");
        int a = sc.nextInt();
        System.out.println("Paper 2: ");
        int b = sc.nextInt();
        System.out.println("Paper 3: ");
        int c = sc.nextInt();
        int total;
        total = a + b + c;
        System.out.println("Total: "+total);
        float percentage;
        percentage = (float)((total/300)*100);
        System.out.println("Percentage: "+percentage);
        if(g.equals("Female") && percentage >= 62){
            System.out.println("Eligible for admission");
        }
        else{
            System.out.println("Not Eligible");
        }
    }

    public static void weeks() {
        System.out.println("""
                Enter a number between 1 to 7
                 1. Monday
                 2.Tuesday
                 3.Wednesday
                 4.Thursday
                 5.Friday
                 6.Saturday
                 7.Sunday
                """);
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        switch (number){
            case 1: System.out.println("Monday (Week Day)");
                break;
            case 2: System.out.println("Tuesday (Week Day)");
                break;
            case 3: System.out.println("Wednesday (Week Day)");
                break;
            case 4: System.out.println("Thursday (Week Day)");
                break;
            case 5: System.out.println("Friday (Week Day)");
                break;
            case 6: System.out.println("Saturday (Weekend Day)");
                break;
            case 7: System.out.println("Sunday (Weekend Day)");
                break;
        }
    }

    public static void Vowels() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char userInput = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for case-insensitive check

        if (isVowel(userInput)) {
            System.out.println(userInput + " is a vowel.");
        } else {
            System.out.println(userInput + " is not a vowel.");
        }
            scanner.close();
        }private static boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch);

            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void Leap(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Year: ");
        int n = Integer.parseInt(scanner.next());
        if (n % 100 != 0){
            if (n % 4 == 0){
                System.out.println("Yes it is a Leap Year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else{
            if (n % 400 == 0){
                System.out.println("Yes it is a Leap Year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
    }

    public static void Greatest(){
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a>b){
            if (a>c){
                System.out.println("A is greatest");
            }
        }
    }

    private static void Ascii() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Number / Character / Symbol...");
        char ch;
        ch = scanner.next().charAt(0);
        if(ch>=65 && ch <= 91){
            System.out.println("Upper Case Alphabet");
        }
        else if(ch>=97 && ch <= 123){
            System.out.println("Lower Case Alphabet");
        }
        else if(ch>=48 && ch <= 57){
            System.out.println("Number");
        }
        else {
            System.out.println("Special Symbol");
        }
    }

    private static void GradingSystem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int total;
        total = a+b+c+d;
        System.out.println("Total = "+total);
        double percentage;
        percentage = ((double) total /400)*100;
        System.out.println("Percentage = "+percentage);

        if (percentage >= 100) {
            System.out.println("Grade A+");
        }
        else if (percentage >= 90) {
            System.out.println("Grade A");
        }
        else if (percentage >= 80){
            System.out.println("Grade B");
        }
        else if (percentage >= 70){
            System.out.println("Grade C");
        }
        else if (percentage >= 60){
            System.out.println("Grade D");
        }
        else if (percentage >= 40){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Fail");
        }
    }


    private static void Discount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        int cp = sc.nextInt();
        System.out.println("Are your a student (y / n)");
        char yorn;
        yorn = sc.next().charAt(0);

        if (yorn == 'y'){
            if (cp >= 500){
                double discount = ((double) cp * 0.10);
                double selling_price = ((double) cp - discount);
                System.out.println("Selling price = "+selling_price);
            }
            else{
                double discount = ((double) cp * 0.05);
                double selling_price = ((double) cp - discount);
                System.out.println("Selling price = "+selling_price);
            }
        }
        else{
            if (cp >= 500){
                double discount = ((double) cp * 0.08);
                double selling_price = ((double) cp - discount);
                System.out.println("Selling price = "+selling_price);
            }
            else{
                double discount = ((double) cp * 0.02);
                double selling_price = ((double) cp - discount);
                System.out.println("Selling price = "+selling_price);
            }
        }
    }

    public static void Money(){
        System.out.println("Enter the amount: \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total amount = ");
        int amount = scanner.nextInt();
        System.out.println("Range = ");
        int range = scanner.nextInt();

        switch(range){
            case 2000: int n1 = amount/2000;
                System.out.println("2000 -> "+n1+" = "+2000*n1);
                amount = amount%2000;
                System.out.println(amount);
        }
    }

}

