import java.util.Scanner;

public class ArraySearch {
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
            System.out.println();
        }
        System.out.println("Enter search key: ");
        int key = sc.nextInt();
        for (i = 0; i < size; i++) {
            if (i == key){
                System.out.println("Element exists");
                System.exit(0);
            }
        }
        System.out.println("Element does not exists");
    }
}
