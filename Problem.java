import java.util.Scanner;

public class Problem {
    public static boolean FirstBadVersion(int version, int bad){
        if (version < bad){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of versions: ");
        int total_input = sc.nextInt();

        System.out.println("Enter first bad version: ");
        int f_bad = sc.nextInt();

        System.out.println("-->"+FirstBadVersion(3,f_bad));
        System.out.println("-->"+FirstBadVersion(4,f_bad));
        System.out.println("-->"+FirstBadVersion(5,f_bad));
    }
}
