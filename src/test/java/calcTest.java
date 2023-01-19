import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calcTest {
    @Test
    public void testFindMax(){
        System.out.println("Should Pass");
        assertEquals(4,calc.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,calc.findMax(new int[]{-12,-1,-3,-4,-2}));
    }

    @Test
    public void testFindMaxErr(){
        assertEquals(-1,calc.findMax(new int[]{2}));
    }
}