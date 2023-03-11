import java.util.HashMap;
import java.util.Map;

/** Roman number conversor
 * I -> 1
 * V -> 10
 * X -> 50
 * L -> 100
 * C -> 500
 * M -> 1000
 * Ex:
 * 24 -> XXIV ;
 * 324 -> CCCXXIV ;
 * 104 -> C IV
 */

public class ConvertRoman {

    public static void main(String[] args) {

        System.out.println(intToRoman(958));
        System.out.println(intToRoman(248));
        System.out.println(intToRoman(25));
        System.out.println(intToRoman(52));


        System.out.println(romanToInt("XXVI"));
        System.out.println(romanToInt("MII"));

    }

    /**
     * Make a map with roman char's, % to get digit
     */
    private static String intToRoman(int num){
        // thousands units from 1000 to 10000
        String [] thousands = { "", "M", "MM", "MMM"};
        // hundreds units from 100 to 1000
        String [] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC" , "CM"};
        // tens units 10 to 100
        String [] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX" , "XC"};
        //0 to 9 in roman
        String [] units = { "" , "I" , "II", "III", "IV", "V", "VI", "VII", "VIII" , "IX" } ;

        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] +
                tens [(num % 100) / 10] +
                units[num % 10];        //reminder of division by 10
    }


    /**
     * i = o to Strlen
     * make map
     * subtract next if bigger then previous
     */
    private static int romanToInt (String roman){

        Map <Character , Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;

        for (int i = 0; i < roman.length() ; i++) {
            if (i > 0 && map.get(roman.charAt(i)) > map.get(roman.charAt( i - 1))) {
                result += map.get(roman.charAt(i)) - 2 * map.get(roman.charAt( i - 1));
            } else {
                result += map.get(roman.charAt(i));
            }
        }

        return result;


    }
}
