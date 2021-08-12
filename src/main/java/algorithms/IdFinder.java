package algorithms;

import model.Id;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author reuzun
 */
public class IdFinder {

    private static List<String> possibleIds = new ArrayList<>();

    public static List<String> findIds(String str) throws Exception {

        List<Integer> indexes = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();

        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == '-'){
                indexes.add(i);
                sb.append("0");
            }else sb.append(charArr[i]);
        }

        int[] arr = new Id(sb.toString()).getIdArr();

        // Handling first 0 - based solution.
        boolean ans = IdValidator.validateId(AlgorithmUtils.intArrToStr(arr));
        if(ans) possibleIds.add(sb.toString());

        findIds(arr, indexes);
        //System.out.println("Count is : " + count);
        return possibleIds;

    }
    //static int count = 0;
    private static void findIds(int[] arr, List<Integer> indexes) throws Exception {
        int a = -1;
        if(indexes.size() > 0) {
            a = indexes.remove(0);
        }else return;
        for(int i = 0; i <= 9 ; i++){
            findIds(arr, indexes);
            arr[a]++;
            if(arr[a] == 10) continue;
            //System.out.println(Arrays.toString(arr));
            //count++;

            String possibleId = AlgorithmUtils.intArrToStr(arr);

            boolean ans = IdValidator.validateId(possibleId);
            if(ans) possibleIds.add(possibleId);
        }
        indexes.add(a);
        arr[a] = 0;
    }

    private static void findIdsHelper(int[] arr, List<Integer> indexes) {

    }


}

