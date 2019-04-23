import mockit.Tested;
import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

    @Tested
    Addition addition;

    @Test
    public void testAddition() {
        addition = new Addition(10,20);
        Assert.assertEquals(30, addition.add());
    }
}