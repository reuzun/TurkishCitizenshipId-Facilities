package algorithms;

import model.Id;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author reuzun
 */
public class RandomIdGeneratorTest {

    @Test
    public void RandomIdGeneratorTest() throws Exception {
        String id = RandomIdGenerator.GenerateRandomId();
        boolean ans = IdValidator.validateId(id);

        Assert.assertTrue(ans);
    }

    @Test
    public void RandomIdGeneratorTestLastDigit() throws Exception {
        for(int i = 0; i < 100_000; i++) {
            String id = RandomIdGenerator.GenerateRandomId();
            int[] arr = new Id(id).getIdArr();
            boolean ans = IdValidator.validateId(id);
            Assert.assertTrue(ans && arr[10]%2==0);
        }

    }




}
