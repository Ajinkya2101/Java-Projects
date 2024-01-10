import java.util.Scanner;

public class LargeSmallSumInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 10000;
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements " + size + " of the array: ");
        int i;
        for (i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + " array: ");
            array[i] = sc.nextInt();
        }

        for (i = 0; i < size; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        for (i = 0; i < size; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        System.out.println("Sum of max and min: "+(max+min));
    }
}
