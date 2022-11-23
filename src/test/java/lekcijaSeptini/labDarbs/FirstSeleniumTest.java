package lekcijaSeptini.labDarbs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver parluks;

    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.manage().window().maximize();
        parluks.navigate().to("https://www.lu.lv/");
    }
    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }


    @Test
    public void testFirstWebPage(){
        System.out.println("Pirmais Selenium Test");
        WebDriver parluks = new ChromeDriver();
parluks.navigate().to("https://www.lu.lv/");
parluks.manage().window().maximize();
parluks.quit();
    }
    @Test
    public void testPageTitle(){
        WebDriver parluks = new ChromeDriver();
        parluks.get("https://www.lu.lv/");
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums,"Latvijas Universitate");
        parluks.quit();

    }
    @Test
    public void testRandom(){

    }


}

