package lekcijaAstoni.pageObjekts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    WebDriver parluks;

    private By pageTitle = By.cssSelector("span.title");

    public ProductsPage(WebDriver parluks) {
        this.parluks = parluks;
    }
 public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);

 }

}

