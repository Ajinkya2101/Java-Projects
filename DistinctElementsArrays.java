import java.util.Arrays;

public class DistinctElementsArrays {
    public static void main(String[] args) {
        int[] arr_1 = {1, 2, 3};
        int[] arr_2 = {3, 4, 5};
        int[] new_1 = new int[10];
        int[] new_2 = new int[10];
        int i, j, m = 0, n = 0;
        for (i = 0; i < arr_1.length; i++) {
            int count1 = 0;
            for (j = 0; j < arr_2.length; j++) {
                if (arr_1[i] != arr_2[j]) {
                    System.out.println(STR."\{arr_1[i]} != \{arr_2[j]}");
                }
                if (arr_1[i] == arr_2[j]){
                    System.out.println(STR."\{arr_1[i]} == \{arr_2[j]}");
                    count1++;
                }
            }
            if (count1 == 0){
                new_1[m] = arr_1[i];
                m++;
            }
        }
        System.out.println("---------------------------------------------------------");
        for (i = 0; i < arr_2.length; i++) {
            int count2 = 0;
            for (j = 0; j < arr_1.length; j++) {
                if (arr_2[i] != arr_1[j]) {
                    System.out.println(STR."\{arr_2[i]} != \{arr_1[j]}");
                }
                if(arr_2[i] == arr_1[j]){
                    System.out.println(STR."\{arr_2[i]} == \{arr_1[j]}");
                    count2++;
                }
            }
            if (count2 == 0){
                new_2[n] = arr_2[i];
                n++;
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(Arrays.toString(new_1));
        System.out.println(Arrays.toString(new_2));
    }
}
