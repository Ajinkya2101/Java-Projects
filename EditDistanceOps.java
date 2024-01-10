import java.util.Scanner;

public class EditDistanceOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s = sc.next();

        System.out.println("Enter second string:");
        String t = sc.next();
        int output = 0;
        int count_s = s.length();
        int count_t = t.length();
        int count = 0,i;

        if (count_t < count_s){
            output = count_t - count_s;
        }
        else if (count_s < count_t){
            output = count_t - count_s;
        }
        else {
            for(i = 0; i <= count_s - 1; i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    count++;
                }
            }
            output = count;

        }
        System.out.println(output);
    }
}
