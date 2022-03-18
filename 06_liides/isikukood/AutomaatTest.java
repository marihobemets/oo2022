package isikukood;

import kujundid.Kolmnurk;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void test1(){
        IsikukoodEE ee = new IsikukoodEE("4513112313");
        assertEquals(false,ee.isMale());
    }

    @Test
    public void test2(){
        IsikukoodLV lv = new IsikukoodLV("120388-51674");
        assertEquals(false,lv.getBirthYear());
    }

    @Test
    public void test3_kujundi_pindala(){
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0)
        assertEquals(565.0, kolmnurk.arvutaPindala(), 0.1);
    }
}
