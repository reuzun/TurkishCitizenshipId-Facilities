package algorithms;

import exceptions.IdRuleException;

import java.util.Arrays;

/**
 * @author reuzun
 */
class AlgorithmUtils {

    public static int getsumOfOddsMultipliedBySeven(int[] arr){
        return 7 * (arr[0] + arr[2] + arr[4] + arr[6] + arr[8]);
    }

    public static int getsumOfEvens(int[] arr){
        return arr[1] + arr[3] + arr[5] + arr[7];
    }

    /**
     * Calculates the tenth digit of Id according to first 9 digit.
     * @param arr : Int array that consist of TurkishCitizenship Id first 9 digit at least.
     * */
    public static int calculateTenthDigit(int[] arr){
        return (getsumOfOddsMultipliedBySeven(arr) - getsumOfEvens(arr)) % 10 >= 0 ?
                (getsumOfOddsMultipliedBySeven(arr) - getsumOfEvens(arr)) % 10 :
                (getsumOfOddsMultipliedBySeven(arr) - getsumOfEvens(arr)) % 10 + 10;

    }

    /**
     * Calculates the eleventh digit of Id according to first 10 digit.
     * @param arr : Int array that consist of TurkishCitizenship Id first 9 digit at least.
     * */
    public static int calculateEleventhDigit(int[] arr){
        return ( Arrays.stream(arr).sum() - arr[10] ) % 10;
    }

    /**
     * Appends each element of array to a StringBuilder to create a string version of it.
     * @param arr : An Array.
     * */
    public static String intArrToStr(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i : arr)
            sb.append(i);
        return sb.toString();
    }

    public static int[] getIdArr(String id) throws IdRuleException {
        int[] ans = new int[11];

        if(null == id) throw new NullPointerException("id must not be null.");
        if(id.length() > 11) throw new IdRuleException("The length must be 11.");

        char[] arr = id.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 57 || arr[i] < 48) throw new IdRuleException("model.Id must consist of numbers. (0-9)");
            ans[i] = Integer.parseInt( String.valueOf(arr[i]) );
        }
        return ans;
    }

}