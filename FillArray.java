import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Arrays.fill(arr, 100);
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
        Arrays.fill(arr,3,6,44);
        System.out.print(Arrays.toString(arr));
    }
}
