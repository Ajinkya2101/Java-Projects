public class Static7 {
    public void show(){
        System.out.println("Non static show");
    }
    {
        show();
    }
    static {
        System.out.println("I am static block");
    }

    public static void main(String[] args) {
        Static7 s = new Static7();
        System.out.println("I am main");
    }
}
