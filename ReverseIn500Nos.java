import static java.lang.System.out;

public class ReverseIn500Nos {
    public static void main(String[] args){
        int rev;
        int no;
        for (int i = 0; i <= 5000; i++){
            no = i;
            rev = 0;
            while(no>0) {
                int rem = i % 10;
                rev = ((rev * 10) + rem);
                no = no / 10;
            }
            if (rev == i){
                out.println(i);
            }
        }
    }
}
