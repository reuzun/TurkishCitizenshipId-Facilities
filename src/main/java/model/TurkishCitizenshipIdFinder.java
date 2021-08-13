package model;

import algorithms.IdFinder;

import java.util.List;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdFinder extends TurkishCitizenshipId{


    @Override
    public List<String> listAvailableIds(String id) throws Exception {
        return IdFinder.findIds(id);
    }

}
