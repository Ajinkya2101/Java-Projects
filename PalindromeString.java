public class PalindromeString {
    public static void main(String[] args) {
        String originalString = "ollo";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
        if(originalString.equals(reversedString)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

}

