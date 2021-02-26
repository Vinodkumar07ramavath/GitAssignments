package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class htmlTable {
    WebDriver driver;
    By rowCount= By.xpath("//*[@id='customers']/tbody/tr");
    By columCount=By.xpath("//*[@id='customers']/tbody/tr[1]/*");

    public htmlTable(WebDriver driver){
        this.driver=driver;
    }
    public List<WebElement> RowCount(){
        return driver.findElements(rowCount);
    }
    public List<WebElement> ColumCount(){
        return driver.findElements(columCount);
    }
}

