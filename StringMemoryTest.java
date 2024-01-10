public class StringMemoryTest {
    public static void main(String[] args) {
        StringMemoryTest t1 = new StringMemoryTest();
        StringMemoryTest t2 = new StringMemoryTest();
        System.out.println(t1 == t2);
        String str1 = "Ashish";
        String str2 = "Ashish";
        System.out.println(str1 == str2);
        String s1 = new String("jelp4code");
        String s2 = new String("jelp4code");
        System.out.println(s1 == s2);
    }
}
