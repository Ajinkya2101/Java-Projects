import java.util.Arrays;

public class NextLargerElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int max;
        int k = 0;
        int[] arr_2 = new int[3];
        for (int i = 0; i < arr.length; i++){

            for(int j = 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    System.out.println(arr[i]+" > "+arr[j]);
                    max = arr[i];
                    System.out.println(max+"\t");
                    arr_2[k] = arr[i];
                    k++;
                }
            }
        }
        System.out.print(Arrays.toString(arr_2));
    }
}
