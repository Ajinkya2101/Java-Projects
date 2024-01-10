import java.util.Scanner;

public class NumberOfOneBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String s = sc.next();
        int tree = 0;
        for(int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '1'){
                ++tree;
            }
        }
        System.out.println(tree);
    }
}
