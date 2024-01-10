import java.util.Scanner;

public class Money {
    public static void main(String[] args){
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
            case 500: n1 = amount/500;
                System.out.println("500 -> "+n1+" = "+500*n1);
                amount = amount%500;
                System.out.println(amount);
            case 200:n1 = amount/200;
                System.out.println("200 -> "+n1+" = "+200*n1);
                amount = amount%200;
                System.out.println(amount);
            case 100: n1 = amount/100;
                System.out.println("100 -> "+n1+" = "+100*n1);
                amount = amount%100;
                System.out.println(amount);
            case 10: n1 = amount/10;
                System.out.println("10 -> "+n1+" = "+10*n1);
                amount = amount%10;
                System.out.println(amount);
        }
    }
}
