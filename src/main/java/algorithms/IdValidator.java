package algorithms;

import model.Id;

import java.util.Arrays;

/**
 * @author reuzun
 */
public class IdValidator {

    public static boolean validateId(String id) throws Exception {
        Id obj = new Id(id);
        int[] arr = obj.getIdArr();

        if( arr[0] == 0 ) return false;

        else if(arr[9] != AlgorithmUtils.calculateTenthDigit(arr) || arr[10] != AlgorithmUtils.calculateEleventhDigit(arr) ){
            return false;
        }

        else return true;

    }

}
