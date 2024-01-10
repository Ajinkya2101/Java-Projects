import java.util.Scanner;

public class ArraysInJava {
    public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        for (int i = 0;i < size; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of all elements: ");
        System.out.println(sum);
    }
}
