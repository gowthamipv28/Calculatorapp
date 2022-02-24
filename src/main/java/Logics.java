import org.testng.Assert;
import org.testng.annotations.Test;

public class Logics {
    @Test
    public void shouldAddTwoNumbers() {
        int result = new Calculator().getAdd(20, 20);
        Assert.assertEquals(40,result);

    }

    @Test
    public void shouldSubtractTwoNumbers() {

        int result = new Calculator().getSub(40, 20);
        Assert.assertEquals(20, result);
    }


    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = new Calculator().getMul(20, 10);
        Assert.assertEquals(200, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        int result = new Calculator().getDiv(30, 3);
        Assert.assertEquals(10, result);
    }

}

