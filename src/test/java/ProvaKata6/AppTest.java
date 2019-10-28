package ProvaKata6;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test(){
        App app = new App();
        assertFalse(App.ControlloArray(new int[]{121,144,19},new int[]{12,1}));
    }

    @Test
    public void Test1(){
        App app = new App();
        assertTrue(App.ControlloArray(new int[]{2,3},new int[]{4,9}));
    }

    @Test
    public void Test2(){
        App app = new App();
        assertFalse(App.ControlloArray(new int[]{11,12},new int[]{121,1}));
    }

    @Test
    public void Test3(){
        App app = new App();
        assertFalse(App.ControlloArray(new int[]{121,144,19},new int[]{12,1}));
    }

}
