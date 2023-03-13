import java.util.HashMap;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=0lkrTeH5m6I&list=PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa
 * Find the majority element in the array.
 * A majority element in an array A[] of size n is an element that appears more than n/2 times
 * (and hence there is at most one such element).
 * Examples :
 *     Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
 *     Output : 4
 *     Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size.
 *     Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
 *     Output : No Majority Element
 *     Explanation: There is no element whose frequency is greater than the half of the size of the array size.
 * { 2 , 3 , 4 , 5 , 2 , 3 , 3 , 3 , 3} majority element is 3 because 8/2 = 4 and 3 appears 4 times
 * {2,2} , {3,4} , {4,1} , {5,1}    //make a map, save keys as values of array and count number of
 * occurrences, save it as value of the map in the key correspondent
 */

public class MajorityElement {

    public static void main(String[] args) {
        int[] a = { 2 , 3 , 4 , 5 , 2 , 3 , 3 , 3 , 3 , 3 , 5 , 5 , 5 , 9 , 8 , 5};
        System.out.println(majorityElement(a));
    }

    static void printMap (Map<Integer,Integer> map)
    {
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
    static int majorityElement(int[] a)
    {
        int size = a.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();


        for(int i:a) {
            Integer val = map.get(i);
            if (val == null) {
                map.put(i,1);   //add element and initialize count to 1
            } else {
                map.put(i,val+1);   //if val exist, increment + 1
            }
        }

        printMap(map);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > size / 2) {
                return entry.getKey();  //return the key with the value > size / 2
            }
        }
        return -1;
    }
}
