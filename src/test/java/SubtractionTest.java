import mockit.Tested;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionTest {

    @Tested
    Subtraction subtract;

    @Test
    public void testSubtraction() {
        subtract = new Subtraction(50, 30);
        Assert.assertEquals(20, subtract.subtract());
    }
}