package modeltest;

import exceptions.IdRuleException;
import model.BUILDER_TYPE;
import model.TurkishCitizenshipId;
import model.TurkishCitizenshipIdBuilder;
import org.junit.Test;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdBuilderTest {


    @Test
    public void TurkishCitizenshipValidatorBuildTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.VALIDATOR);
    }

    @Test
    public void TurkishCitizenshipCreatorBuildTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.CREATOR);
    }

    @Test
    public void TurkishCitizenshipFinderBuildTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.FINDER);

    }

}
