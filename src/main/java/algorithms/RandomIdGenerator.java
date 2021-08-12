package algorithms;

import java.util.Arrays;

/**
 * @author reuzun
 */
public class RandomIdGenerator {

    public static String GenerateRandomId(){
        return AlgorithmUtils.intArrToStr(RandomIntArr());

    }

    private static int[] RandomIntArr(){
        int[] arr = new int[11];

        for(int i = 0; i < arr.length - 2; i++){
            arr[i] = i == 0 ? 1 + (int)(Math.random() * 8) : (int)(Math.random() * 9);
        }

        arr[9] = AlgorithmUtils.calculateTenthDigit(arr);
        arr[10] = AlgorithmUtils.calculateEleventhDigit(arr);
        return arr;
    }

}
