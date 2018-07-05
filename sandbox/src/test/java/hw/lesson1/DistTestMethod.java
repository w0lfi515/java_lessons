package hw.lesson1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistTestMethod {

    @Test
    public void distTest(){
        Point p1 = new Point(-4.0,0.0);
        Point p2 = new Point(6.0,0.0);
        Assert.assertEquals(p1.distance(p2),10.0);
    }
}
