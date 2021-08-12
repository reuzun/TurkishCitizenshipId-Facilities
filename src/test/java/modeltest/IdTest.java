package modeltest; /**
 * @author reuzun
 */
import model.Id;
import org.junit.Assert;
import org.junit.Test;

public class IdTest {

    @Test
    public void IdArrTest() throws Exception {
        Id id = new Id("12535246879");
        Assert.assertArrayEquals(id.getIdArr(), new int[]{1, 2, 5, 3, 5, 2, 4, 6, 8, 7, 9});
    }

    @Test
    public void IdStrTest() throws Exception {
        Id id = new Id("12535246879");
        Assert.assertEquals(id.getId(), "12535246879");
    }

}