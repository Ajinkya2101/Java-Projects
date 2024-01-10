class Area{
    int l, b;
    public Area(int l, int b){
        this.l = l;
        this.b = b;
    }
    public int Dimensions(){
        return l * b;
    }
}
public class Rectangle{
    public static void main(String[] args) {
        Area rectangle1 = new Area(4,5);
        Area rectangle2 = new Area(5,8);

        int Area1 = rectangle1.Dimensions();
        int Area2 = rectangle2.Dimensions();
        System.out.println(Area1);
        System.out.println(Area2);
    }
}
