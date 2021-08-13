package model;

import exceptions.WrongTypeObjectException;

import java.util.List;

/**
 * @author reuzun
 */
public abstract class TurkishCitizenshipId {



    public boolean validate(String id) throws Exception {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdValidator instead of that object.");
    }

    public String create() throws WrongTypeObjectException {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdCreator instead of that object.");
    }

    public List<String> listAvailableIds(String id) throws Exception {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdFinder instead of that object.");
    }

}
