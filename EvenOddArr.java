import java.util.Scanner;

public class EvenOddArr {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
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
            if (i%2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("\nEven: "+even+"\nOdd: "+odd);
    }
}
