package model;

import exceptions.WrongTypeObjectException;

import java.util.List;

/**
 * @author reuzun
 */
public abstract class TurkishCitizenshipId {

    protected String id;

    TurkishCitizenshipId(String id) throws Exception {
        this.id = id;
    }

    public boolean validate() throws Exception {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdValidator instead of that object.");
    }

    public String create() throws WrongTypeObjectException {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdCreator instead of that object.");
    }

    public List<String> listAvailableIds() throws Exception {
        throw new WrongTypeObjectException("Create model.TurkishCitizenshipIdFinder instead of that object.");
    }

}
