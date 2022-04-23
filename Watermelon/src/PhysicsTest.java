import static org.junit.Assert.*;
import org.junit.Test;
public class PhysicsTest {
    @Test
    public void Equilibrium1() {
        var Phy = new Physics();
        int x[] = {1, 0, -1};
        int y[] = {2, 1, -3};
        int z[] = {5, 0, -5};
        assertTrue(Phy.Equilibrium(3, x, y, z));
    }
    @Test
    public void Equilibrium2() {
        var phy = new Physics();
        int x[] = {14, 12};
        int y[] = {5, 9};
        int z[] = {-1, 1};
        assertFalse(phy.Equilibrium(2, x, y, z));
    }
    @Test
    public void Equilibrium3() {
        var phy = new Physics();
        int x[] = {0};
        int y[] = {0};
        int z[] = {0};
        assertTrue(phy.Equilibrium(1, x, y, z));
    }
    @Test
    public void Zero() {
        var phy = new Physics();
        int x[] = {1};
        int y[] = {5};
        int z[] = {9};
        assertThrows(IllegalArgumentException.class, () -> { phy.Equilibrium(0, x, y, z);});
    }
    @Test
    public void less_than_Zero() {
        var phy = new Physics();
        int x[] = {0};
        int y[] = {0};
        int z[] = {0};
        assertThrows(IllegalArgumentException.class, () -> { phy.Equilibrium(-5, x, y, z);});
    }
}