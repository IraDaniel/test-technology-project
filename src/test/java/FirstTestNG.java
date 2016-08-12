import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Irina_Daniel on 8/4/2016.
 */
public class FirstTestNG {

    @Test
    public void testSum() throws Exception {

        Assert.assertEquals(5, 5);
    }
}
