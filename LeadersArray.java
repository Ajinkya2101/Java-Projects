import java.util.Arrays;

public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int max;
        int k = 0;
        int[] arr_2 = new int[30];
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    max = arr[i];
                    arr_2[k] = arr[i];
                    k++;
                }
            }
        }
        System.out.print(Arrays.toString(arr_2));
    }
}
