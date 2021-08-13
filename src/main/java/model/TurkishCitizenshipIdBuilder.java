package model;

import exceptions.IdRuleException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdBuilder {



    public TurkishCitizenshipId build(BUILDER_TYPE type) throws Exception {
        /*if(null != this.id) {
            Pattern pattern = Pattern.compile("[^0-9-]");
            Matcher matcher = pattern.matcher(this.id);

            if (matcher.find()) throw new IdRuleException("Id must consist of numbers.");
        }*/

        if( type == BUILDER_TYPE.FINDER ) return new TurkishCitizenshipIdFinder();
        else if( type == BUILDER_TYPE.CREATOR ) return new TurkishCitizenshipIdCreator();
        else if( type == BUILDER_TYPE.VALIDATOR ) return new TurkishCitizenshipIdValidator();
        else return null;
    }

}
