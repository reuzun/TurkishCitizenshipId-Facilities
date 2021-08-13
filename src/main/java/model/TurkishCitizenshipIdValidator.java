package model;

import algorithms.IdValidator;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdValidator extends TurkishCitizenshipId{

    /**
     * Validates the id.
     * @param id TurkishCitizenship Id
     * */
    @Override
    public boolean validate(String id) throws Exception {
        return IdValidator.validateId(id);
    }

}
