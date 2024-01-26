package junit.practice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1000);
        assertEquals("$1000", money);
    }

    @Test
    public void negativeMoneyTest() {
        String money = MoneyUtil.format(-1000);
        assertEquals("-$1000", money);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionMoneyTest() {
        MoneyUtil.format(-1000, null);
    }

    @Test
    public void negativeEuroMoneyTest() {
        String money = MoneyUtil.format(-1000, "€");
        assertEquals("-€1000", money);
    }

}
