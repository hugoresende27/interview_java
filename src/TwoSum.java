import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return the indices of the two numbers whose sum
 * is equal to a given target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9.
 * The output should be [0, 1].
 * Because nums[0] + nums[1] = 2 + 7 = 9.
 * -----------------------------------------------------------
 * Algorithm
 * brute force
 * 2 nested loops
 * i = 0 to N
 * j = 0 to N
 * arr[i] + arr[j] == Exp Result  // o (n**2)
 * -------------------------
 * numMap -> empty Map
 * for i = 0 to N   //loop once throuth array
 * delta = target - arr[i] //delta save the target - value
 * if numMap contains delta //if delta in array
 *      return [i, numMap(delta).value] //find result
 * numMap.put(arr[i], i)    //keep add values
 *
 */

public class TwoSum {

    public static void main(String[] args) {

        int[] n = new int[] {2,3,7,4,8};
        int t = 7;
        int[] result = getTwoSum(n ,t);
        System.out.println(result[0] +" , "+ result[1]);


    }

    public static int[] getTwoSum(int[] numbers, int target){

        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i=0; i<numbers.length ; i++) {
            int delta = target - numbers[i]; //find the target - value of array
            if (visitedNumbers.containsKey(delta)){
                return new int[] {i , visitedNumbers.get(delta)};
                //return i if find plus position of delta
            }
            visitedNumbers.put(numbers[i] , i);
        }
        return new int[]{-1, -1};
    }
}
