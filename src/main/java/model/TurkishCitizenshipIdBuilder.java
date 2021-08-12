package model;

import exceptions.IdRuleException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdBuilder {

    private String id;

    public TurkishCitizenshipIdBuilder setId(String id){
        this.id = id;
        return this;
    }

    public TurkishCitizenshipId build(BUILDER_TYPE type) throws Exception {
        if(null != this.id) {
            Pattern pattern = Pattern.compile("[^0-9-]");
            Matcher matcher = pattern.matcher(this.id);

            if (matcher.find()) throw new IdRuleException("Id must consist of numbers.");
        }

        if( type == BUILDER_TYPE.FINDER ) return new TurkishCitizenshipIdFinder(this.id);
        else if( type == BUILDER_TYPE.CREATOR ) return new TurkishCitizenshipIdCreator(this.id);
        else if( type == BUILDER_TYPE.VALIDATOR ) return new TurkishCitizenshipIdValidator(this.id);
        else return null;
    }

}
