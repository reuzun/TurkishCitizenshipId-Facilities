package algorithms;


import java.util.ArrayList;
import java.util.List;

/**
 * @author reuzun
 */
public class IdFinder {

    private static List<String> possibleIds = new ArrayList<>();
    private static boolean calculateTenthDigit = true;
    private static boolean calculateEleventhDigit = true;

    /**
     * Figure outs all possible combinations of - values and tries to validate them.
     * @param str Id with unknown values. Ex: 145--7896-8
     * @return List consist of possible Id Strings
     * */
    public static List<String> findIds(String str) throws Exception {

        List<Integer> indexes = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();



        for(int i = 0; i < charArr.length - 2; i++){
            if(charArr[i] == '-'){
                if(i == 0) sb.append(1);
                else sb.append("0");
                indexes.add(i);
            }else sb.append(charArr[i]);
        }

        if(charArr[9] != '-'){
            sb.append(charArr[9]);
            calculateTenthDigit = false;
        }
        if(charArr[10] != '-') {
            sb.append(charArr[10]);
            calculateEleventhDigit = false;
        }


        int[] arr = AlgorithmUtils.getIdArr(sb.toString());

        if(calculateTenthDigit)arr[9] = AlgorithmUtils.calculateTenthDigit(arr);
        if(calculateEleventhDigit)arr[10] = AlgorithmUtils.calculateEleventhDigit(arr);
        if(indexes.contains(new Integer(9)))indexes.remove(new Integer(9));
        if(indexes.contains(new Integer(10)))indexes.remove(new Integer(10));

        // Handling first 0 - based solution.
        boolean ans = IdValidator.validateId(AlgorithmUtils.intArrToStr(arr));
        if(ans) possibleIds.add(AlgorithmUtils.intArrToStr(arr));

        findIds(arr, indexes);

        return possibleIds;

    }

    public static int count = 0;

    private static void findIds(int[] arr, List<Integer> indexes) throws Exception {
        int a = -1;
        if(indexes.size() > 0) {
            a = indexes.remove(0);
        }else return;
        for(int i = 0; i <= 9 ; i++){
            findIds(arr, indexes);
            arr[a]++;
            if(arr[a] == 10) continue;

            if(calculateTenthDigit)arr[9] = AlgorithmUtils.calculateTenthDigit(arr);
            if(calculateEleventhDigit)arr[10] = AlgorithmUtils.calculateEleventhDigit(arr);

            String possibleId = AlgorithmUtils.intArrToStr(arr);

            boolean ans = IdValidator.validateId(possibleId);
            if(ans) possibleIds.add(possibleId);
        }
        indexes.add(a);
        arr[a] = 0;
    }

}

