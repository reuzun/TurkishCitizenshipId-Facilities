package algorithms;

import java.util.Arrays;

/**
 * @author reuzun
 */
public class AlgorithmUtils {

    public static int getsumOfOddsMultipliedBySeven(int[] arr){
        return 7 * (arr[0] + arr[2] + arr[4] + arr[6] + arr[8]);
    }

    public static int getsumOfEvens(int[] arr){
        return arr[1] + arr[3] + arr[5] + arr[7];
    }

    public static int calculateTenthDigit(int[] arr){
        return (getsumOfOddsMultipliedBySeven(arr) - getsumOfEvens(arr)) % 10 >= 0 ?
                (getsumOfOddsMultipliedBySeven(arr) - getsumOfEvens(arr)) % 10 :
                (getsumOfOddsMultipliedBySeven(arr) - getsumOfEvens(arr)) % 10 + 10;

    }

    public static int calculateEleventhDigit(int[] arr){
        return ( Arrays.stream(arr).sum() - arr[10] ) % 10;
    }

    public static String intArrToStr(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i : arr)
            sb.append(i);
        return sb.toString();
    }

}