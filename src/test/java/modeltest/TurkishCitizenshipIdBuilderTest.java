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


    public static String id = "12535246879";
    public static String wrongId = "125q5246879";


    @Test
    public void TurkishCitizenshipValidatorTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(id)
                .build(BUILDER_TYPE.VALIDATOR);
    }

    @Test
    public void TurkishCitizenshipCreatorTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(id)
                .build(BUILDER_TYPE.CREATOR);
    }

    @Test
    public void TurkishCitizenshipFinderTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(id)
                .build(BUILDER_TYPE.FINDER);

    }

    @Test(expected = IdRuleException.class)
    public void TurkishCitizenshipValidatorTestW() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(wrongId)
                .build(BUILDER_TYPE.VALIDATOR);
    }

    @Test(expected = IdRuleException.class)
    public void TurkishCitizenshipCreatorTestW() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(wrongId)
                .build(BUILDER_TYPE.CREATOR);
    }

    @Test(expected = IdRuleException.class)
    public void TurkishCitizenshipFinderTestW() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(wrongId)
                .build(BUILDER_TYPE.FINDER);
    }

}
