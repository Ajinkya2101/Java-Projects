public class Test1 {
    int[] arr_1 = {1, 2, 3};
    int[] arr_2 = {3, 4, 5};
    int[] new_1 = new int[10];
    int[] new_2 = new int[10];
    int m = 0;
    int n = 0;

    public void main(String[] args) {
        compareArrays();
    }

    public void compareArrays() {
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_2.length; j++) {
                if (arr_1[i] != arr_2[j]) {
                    System.out.println(arr_1[i] + " != " + arr_2[j]);
                    m++;
                } else {
                    System.out.println(arr_1[i] + " == " + arr_2[j]);
                    break;
                }
            }
        }
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < arr_2.length; i++) {
            for (int j = 0; j < arr_1.length; j++) {
                if (arr_2[i] != arr_1[j]) {
                    System.out.println(arr_2[i] + " != " + arr_1[j]);
                    n++;
                } else {
                    System.out.println(arr_2[i] + " == " + arr_1[j]);
                    break;
                }
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(m+"\t"+n);
    }
}