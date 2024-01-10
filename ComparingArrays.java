import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {4,5,6};
        int[] num3 = {7,8,9};
        System.out.println(Arrays.equals(num1, num2));
        System.out.println(Arrays.equals(num1, num3));
    }
}
