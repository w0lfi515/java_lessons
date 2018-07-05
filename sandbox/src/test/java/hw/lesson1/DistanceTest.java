package hw.lesson1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {

    @Test
    public void testDistance(){
        Point p1 = new Point(-3.0,0.0);
        Point p2 = new Point(1.0,3.0);
        Assert.assertEquals(Lesson1.distance(p1,p2),5.0);

    }
}
