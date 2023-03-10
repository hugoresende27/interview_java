/**
 * To reverse an int , first
 * input / 10 to get last index
 * reversed x 10 + 1 to add to first index
 * care min and max
 */

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println( reverse(12345) );

    }

    private static int reverse(int input){
        long reversed = 0;
        while(input != 0){
            reversed = reversed * 10 + input % 10 ;
            input /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) reversed;
    }
}
