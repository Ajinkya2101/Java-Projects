public class Static8 {
    public void show(){
        System.out.println("Non static show");
    }
    public static void show1(){
        System.out.println("Static show");
    }
    {
        show();
    }
    static {
        show1();
    }

    public static void main(String[] args) {
        Static8 s = new Static8();
        System.out.println("I am main");
    }
}
