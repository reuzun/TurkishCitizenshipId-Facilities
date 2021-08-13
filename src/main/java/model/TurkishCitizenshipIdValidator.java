package model;

import algorithms.IdValidator;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdValidator extends TurkishCitizenshipId{


    @Override
    public boolean validate(String id) throws Exception {
        return IdValidator.validateId(id);
    }

}
