package model;

import algorithms.IdValidator;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdValidator extends TurkishCitizenshipId{


    public TurkishCitizenshipIdValidator(String id) throws Exception {
        super(id);
    }

    @Override
    public boolean validate() throws Exception {
        return IdValidator.validateId(id);
    }

}
