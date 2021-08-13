package model;

import exceptions.WrongTypeObjectException;

import java.util.List;

/**
 * @author reuzun
 */
public abstract class TurkishCitizenshipId {


    /**
     * Validates the id.
     * @param id TurkishCitizenship Id
     * @throws WrongTypeObjectException if BUILD_TYPE is not correct
     * */
    public boolean validate(String id) throws Exception {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdValidator instead of that object.");
    }

    /**
     * Creates randomId
     * @throws WrongTypeObjectException if BUILD_TYPE is not correct
     * */
    public String create() throws WrongTypeObjectException {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdCreator instead of that object.");
    }

    /**
     * List possible Id's. With trying all combinations of - values with numbers.
     * @param id A string including "-" ex: 145--7156--
     * @return validated combinations of Id's
     * @throws WrongTypeObjectException if BUILD_TYPE is not correct
     * */
    public List<String> listAvailableIds(String id) throws Exception {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdFinder instead of that object.");
    }

}
