package model;

import algorithms.RandomIdGenerator;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdCreator extends TurkishCitizenshipId{


    public TurkishCitizenshipIdCreator(String id) throws Exception {
        super(id);
    }

    @Override
    public String create() {
        return RandomIdGenerator.GenerateRandomId();
    }

}
