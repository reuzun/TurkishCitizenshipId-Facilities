package model;

import algorithms.IdFinder;

import java.util.List;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdFinder extends TurkishCitizenshipId{


    public TurkishCitizenshipIdFinder(String id) throws Exception {
        super(id);
    }

    @Override
    public List<String> listAvailableIds() throws Exception {
        return IdFinder.findIds(id);
    }

}
