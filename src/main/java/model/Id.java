package model;

import exceptions.IdRuleException;

/**
 * @author reuzun
 */
public class Id {

    private int[] id = new int[11];
    private String idStr;

    public Id(String id) throws Exception {
        if(null == id) throw new NullPointerException("id must not be null.");
        if(id.length() > 11) throw new IdRuleException("The length must be 11.");

        idStr = id;
        char[] arr = id.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 57 || arr[i] < 48) throw new IdRuleException("model.Id must consist of numbers. (0-9)");
            this.id[i] = Integer.parseInt( String.valueOf(arr[i]) );
        }
    }


    public String getId(){
        return this.idStr;
    }

    public int[] getIdArr(){
        return this.id;
    }

}
