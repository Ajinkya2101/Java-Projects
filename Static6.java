public class Static6 {
    {
        System.out.println("I am non static block");
    }
    static{
        System.out.println("I am in static block");
    }

    public static void main(String[] args) {
        Static6 s = new Static6();
        System.out.println("I am main block.");
    }
}
