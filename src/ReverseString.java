/**
 * String Builder approach
 * In Java Strings are immutables, means if change a string
 * you create a new instance of the string, always
 * StringBuilder(str).
 *     reverse().
 *     toString()
 * --------------------------
 * Manually
 * Loop throug
 */

public class ReverseString {

    public static void main(String[] args) {


        String str = "Hello Hugo!";
        System.out.println(reverseWithSStringBuilder(str));
        System.out.println(reverseManually(str));
        System.out.println(reverseManuallyB(str));
    }


    //dev way, use java api string builder
    private static String reverseWithSStringBuilder(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }


    //with string builder manually
    private static String reverseManually (String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1 ; i >= 0 ; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    //brute force, not recommended
    private static String reverseManuallyB (String str) {
        String sb = "";

        for (int i = str.length() - 1 ; i >= 0 ; i--){
            sb += str.charAt(i);
        }

        return sb.toString();
    }

}
