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
    public void TurkishCitizenshipValidatorTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.VALIDATOR);
    }

    @Test
    public void TurkishCitizenshipCreatorTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.CREATOR);
    }

    @Test
    public void TurkishCitizenshipFinderTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.FINDER);

    }

}
