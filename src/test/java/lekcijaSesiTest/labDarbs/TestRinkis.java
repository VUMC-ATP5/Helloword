package lekcijaSesiTest.labDarbs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRinkis {
        @Test


public void testRinkaLinijasFormula(){
                System.out.println("Hello test");
            Rinkis mansRinkis = new Rinkis(4.5);

            Double expectedArea = 63.62;
            Double actualArea = mansRinkis.rekinatLaukumu();
            Assert.assertEquals(actualArea,expectedArea);

        }


}
