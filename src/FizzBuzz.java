/**
 * FizzBuzz algorithm :
 *   1 - N
 *   for i = 1 to N
 *   if i % 3 == 0 AND i % 5 == 0 "FizzBuzz"
 *   else if i % 3 == 0 "Fizz"
 *   else if i % 4 == 0 "Buzz"
 *   print i
 */

public class FizzBuzz {
    public static void main(String[] args) {

        printFizzBuzz(100);


    }

    public static void printFizzBuzz(int n){
        for(int i = 0 ; i <= 100 ; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if ( i % 5 == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}
