package algorithms;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author reuzun
 */
public class IdValidatorTest {

    @Test
    public void TurkishCitizenshipFindTest() throws Exception {
        boolean ans = IdValidator.validateId("22734013798");
        Assert.assertTrue(ans);
    }

    @Test
    public void TurkishCitizenshipFindTestW() throws Exception {
        boolean ans = IdValidator.validateId("01225585259");
        Assert.assertFalse(ans);
    }

    @Test
    public void TurkishCitizenshipFindTestW2() throws Exception {
        boolean ans = IdValidator.validateId("11225585259");
        Assert.assertFalse(ans);
    }

}