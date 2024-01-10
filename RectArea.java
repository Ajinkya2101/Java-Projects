import java.util.Scanner;

class Area{
    int length, breadth;
    public Area(int l, int b){
        length = l;
        breadth = b;
    }
    public void ReturnArea(){
        System.out.println("Area = "+ length * breadth);
        }
}
public class RectArea{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("length = ");
            int length = sc.nextInt();
            System.out.println("breadth = ");
            int breadth = sc.nextInt();
            Area rectangle = new Area(length,breadth);
            rectangle.ReturnArea();
        }
    }
}
