package tudelft.myleap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class myleapTest {
@Test
public void LeapYearwith400() {
    myleap ly = new myleap();
    boolean leap = ly.isLeapYear(2000);
    Assertions.assertTrue(leap);
        }
@Test
public void LeapYearwith4but100(){
    myleap ly = new myleap();
    boolean leap = ly.isLeapYear(2020);
    Assertions.assertTrue(leap);
}
@Test
public void NonLeapwith100(){
    myleap ly = new myleap();
    Assertions.assertFalse(ly.isLeapYear(1500));
}

@Test
public void NonLeapwithanyother(){
    myleap ly = new myleap();
    Assertions.assertFalse(ly.isLeapYear(2017));
    }

}