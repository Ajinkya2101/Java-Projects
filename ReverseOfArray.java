import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements " + size + " of the array: ");
        int i;
        for (i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + " array: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        System.out.println("Reverse Array: ");
        for (i = size - 1; i >= 0; i--){
            System.out.print(array[i]+"\t");
        }
    }
}
