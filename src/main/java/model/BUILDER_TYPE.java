package model;

/**
 * @author reuzun
 */
public enum BUILDER_TYPE {
    /**
     * Use for validating.
     * */
    VALIDATOR,
    /**
     * Use for creating random TurkishCitizenshipIds.
     * */
    CREATOR,
    /**
     * Use for listing possible Id's
     * */
    FINDER
}
