/**
 * Longest Palindrome substring
 * brute force, nested loop, starting in first and end
 * --------------------------------
 * performance, start in the middle of string
 * compare chars
 * if middle are two chars, compare those first
 */

public class Palindrome {
    static int resultStart;
    static int resultLength;

    public static void main(String[] args) {

        System.out.println(longestPalindrome("asfdhjvhhygqwca"));
        System.out.println(longestPalindrome("adasdcacs"));
        System.out.println(longestPalindrome("abcabcabc"));
    }

    private static String longestPalindrome(String s){


        int strLength = s.length();

        if (strLength < 2){ //if string as 2 chars
            return  s;
        }

        //find the center
        for (int start= 0; start < strLength - 1 ; start++){
            expandRange(s, start, start);
            expandRange(s, start, start + 1);//if even, center as 2 chars
        }

        return s.substring(resultStart,resultStart + resultLength );
    }

    private static void expandRange(String str, int begin, int end) {

        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)){
            begin--;
            end++;
        }
        if (resultLength < end- begin - 1){
            resultStart = begin + 1;
            resultLength = end - begin - 1 ;

        }
    }
}
