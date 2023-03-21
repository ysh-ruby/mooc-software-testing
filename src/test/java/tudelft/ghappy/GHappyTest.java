package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    public GHappyTest(){
    }
    @Test
    public void no_g(){
        GHappy gstring = new GHappy();
        boolean result = gstring.gHappy("abjkfld");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void no_2gs(){
        GHappy gstring= new GHappy();
        Assertions.assertFalse(gstring.gHappy("abgabgag"));
    }

    @Test
    public void twogstogether(){
        GHappy gstring = new GHappy();
        Assertions.assertTrue((gstring.gHappy("aaggaa")));
    }

}
