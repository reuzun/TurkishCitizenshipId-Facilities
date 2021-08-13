package model;

import algorithms.IdFinder;

import java.util.List;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdFinder extends TurkishCitizenshipId{


    /**
     * List possible Id's. With trying all combinations of - values with numbers.
     * @param id A string including "-" ex: 145--7156--
     * @return validated combinations of Id's
     * */
    @Override
    public List<String> listAvailableIds(String id) throws Exception {
        return IdFinder.findIds(id);
    }

}
