package my.pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {


    @Test
public void testPoint(){
        Point p = new Point(3,2,7,8);
       Assert.assertEquals(p.distance(),7.211102550927978);
        //Assert.assertEquals(p.distance(),7.2);
    }
}
