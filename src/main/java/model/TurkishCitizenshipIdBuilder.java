package model;

import exceptions.IdRuleException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdBuilder {


    /**
     * @param type Builder type
     * */
    public TurkishCitizenshipId build(BUILDER_TYPE type) throws Exception {
        if( type == BUILDER_TYPE.FINDER ) return new TurkishCitizenshipIdFinder();
        else if( type == BUILDER_TYPE.CREATOR ) return new TurkishCitizenshipIdCreator();
        else if( type == BUILDER_TYPE.VALIDATOR ) return new TurkishCitizenshipIdValidator();
        else return null;
    }

}
