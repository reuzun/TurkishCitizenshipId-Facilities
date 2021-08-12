package modeltest;

import exceptions.WrongTypeObjectException;
import model.BUILDER_TYPE;
import model.TurkishCitizenshipId;
import model.TurkishCitizenshipIdBuilder;
import org.junit.Test;

/**
 * @author reuzun
 */
public class TurkishCitizenshipIdCreatorTest {

    public static String id = "12535246879";


    @Test
    public void TurkishCitizenshipCreatorTest() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(id)
                .build(BUILDER_TYPE.CREATOR);
        obj.create();
    }

    @Test(expected = WrongTypeObjectException.class)
    public void TurkishCitizenshipCreatorTest2() throws Exception {
        TurkishCitizenshipId obj = new TurkishCitizenshipIdBuilder()
                .setId(id)
                .build(BUILDER_TYPE.FINDER);
        obj.create();
    }

}
