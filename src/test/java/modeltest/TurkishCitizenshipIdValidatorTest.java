package modeltest;

import exceptions.WrongTypeObjectException;
import model.BUILDER_TYPE;
import model.TurkishCitizenshipId;
import model.TurkishCitizenshipIdBuilder;
import org.junit.Test;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdValidatorTest {

    public static String id = "12535246879";


    @Test
    public void TurkishCitizenshipValidatorTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(id)
                .build(BUILDER_TYPE.VALIDATOR);
        obj.validate();
    }

    @Test(expected = WrongTypeObjectException.class)
    public void TurkishCitizenshipValidatorTest2() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(id)
                .build(BUILDER_TYPE.CREATOR);
        obj.validate();
    }

}
