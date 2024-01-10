import java.util.Arrays;

public class ProductSmallPair {
    public static void main(String args[])
    {
        int[] arr = {9, 8, -7, 3, 9, 3};
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int min1 = arr[0];
        int min2 = arr[1];
        int max = arr[5];

        int sumOfMin = min1+min2;
        if(sumOfMin < max){
            int product = min1*min2;
            System.out.println(product);
        }
    }
}
