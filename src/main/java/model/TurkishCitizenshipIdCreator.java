package model;

import algorithms.RandomIdGenerator;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdCreator extends TurkishCitizenshipId{



    @Override
    public String create() {
        return RandomIdGenerator.GenerateRandomId();
    }

}
