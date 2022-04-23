import org.junit.Test;
import static org.junit.Assert.*;
public class WatermelonTest {
    @Test
    public void Even_Work() {
        var watermelon = new Watermelon();
        assertTrue(watermelon.weight(20));
    }
    @Test
    public void Odd_Not_Work() {
        var watermelon = new Watermelon();
        assertFalse(watermelon.weight(13));
    }
    @Test
    public void Two_Not_Work() {
        var watermelon = new Watermelon();
        assertFalse(watermelon.weight(2));
    }
    @Test
    public void Less_Than_Two_Not_Work() {
        var watermelon = new Watermelon();
        assertFalse(watermelon.weight(-10));
    }
}