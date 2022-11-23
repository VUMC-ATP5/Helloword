package lekcijaSesiTest.labDarbs;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
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



        @BeforeMethod
        public void sagatavosanas(){
            System.out.println("Si metod etiek izpildita pirms katra testa");

        }
    @AfterMethod
    public void pecDarbibas(){ //tearDown
        System.out.println("Šī metode tiek izpildīta pēc katra testa");

    }



}
