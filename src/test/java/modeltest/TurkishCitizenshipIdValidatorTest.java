package modeltest;

import exceptions.IdRuleException;
import exceptions.WrongTypeObjectException;
import model.BUILDER_TYPE;
import model.TurkishCitizenshipId;
import model.TurkishCitizenshipIdBuilder;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdValidatorTest {

    public static String id = "12535246879";


    @Test
    public void TurkishCitizenshipValidatorTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.VALIDATOR);
        boolean ans = obj.validate("12535246879");
        Assert.assertFalse(ans);
    }

    @Test(expected = WrongTypeObjectException.class)
    public void TurkishCitizenshipValidatorTestWithWrongType() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.CREATOR);
        obj.validate("12535246879");
    }

    @Test(expected = IdRuleException.class)
    public void TurkishCitizenshipValidatorTestWithWrongInput() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.VALIDATOR);
        obj.validate("asdasd");
    }

}
