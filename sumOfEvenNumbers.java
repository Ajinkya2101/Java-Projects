public class sumOfEvenNumbers {
    public static void main(String[] args){
        int n = 20;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of first 20 even numbers: "+sum);
    }
}
