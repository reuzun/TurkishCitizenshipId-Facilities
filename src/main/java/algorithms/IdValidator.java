package algorithms;



/**
 * @author reuzun
 */
public class IdValidator {

    /**
     * Validates the Id. Returns true if validated.
     * @param id : TurkishCitizenshipId
     * */
    public static boolean validateId(String id) throws Exception {
        int[] arr = AlgorithmUtils.getIdArr(id);

        if( arr[0] == 0 ) return false;

        else if(arr[9] != AlgorithmUtils.calculateTenthDigit(arr) || arr[10] != AlgorithmUtils.calculateEleventhDigit(arr) ){
            return false;
        }

        else return true;

    }

}
