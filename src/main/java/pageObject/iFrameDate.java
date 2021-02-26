package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class iFrameDate {
    WebDriver driver;
    public iFrameDate(WebDriver driver){
        this.driver=driver;
    }
    By iframe =  By.xpath("//*[@id='content']/iframe");
    By datepicker=By.cssSelector("input[id='datepicker']");
    By compare=By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']");
    By clickNext=By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span");
    By allDates=By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td");
    public WebElement Iframe(){
        return driver.findElement(iframe);
    }
    public WebElement DatePickerClick(){
        return driver.findElement(datepicker);
    }
    public WebElement Compare(){
        return driver.findElement(compare);
    }
    public WebElement ClickNext(){
        return driver.findElement(clickNext);
    }
    public List<WebElement> Dates(){
        return driver.findElements(allDates);
    }
}
