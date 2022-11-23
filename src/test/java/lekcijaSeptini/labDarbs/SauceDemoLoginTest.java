package lekcijaSeptini.labDarbs;

import lekcijaSeptini.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {
    WebDriver parluks;
    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.manage().window().maximize();
        parluks.navigate().to("https://www.saucedemo.com/");
    }
    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }

    @Test
    public void testLoginEmptyUsernameAndPassword(){
WebElement lietotajaVardsIevadesLauks = parluks.findElement(By.id("user-name"));
lietotajaVardsIevadesLauks.sendKeys("ngngnng");
     WebElement passwordField = parluks.findElement(By.id("password"));
     passwordField.sendKeys("secret_sauce");
     WebElement loginPoga = parluks.findElement(By.id("login-button"));
     loginPoga.click();
     WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

     String errorText = errorTextField.getText();
     Assert.assertEquals(errorText,"Epic sadface: Username and password do not match any user in this service");
    }

    private void testLogin(String username,String password,String expectedErrorMessage){
        WebElement lietotajaVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajaVardsIevadesLauks.sendKeys(username);
        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();
        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, expectedErrorMessage);

    }
}
