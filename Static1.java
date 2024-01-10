public class Static1 {
    static int num = staticMethod();
    static{
        System.out.println("Inside static block");
    }
    public static int staticMethod() {
        System.out.println("From staticMethod");
        return 40;
    }

    public static void main(String[] args) {
        System.out.println("num: "+num);
        System.out.println("From main");
    }
}
