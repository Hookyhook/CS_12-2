import static org.junit.Assert.assertEquals;

import org.junit.Test;

import DEA.DEA;

public class test {

    @Test
    public void testForBY() {
        assertEquals(true, DEA.runDEA("BY"));
    }

    @Test
    public void testForBW() {
        assertEquals(true, DEA.runDEA("BW"));
    }

    @Test
    public void testForWrong() {
        assertEquals(false, DEA.runDEA("BT"));
    }
}
