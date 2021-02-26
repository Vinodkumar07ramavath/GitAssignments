package vinodkumar;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.iFrameDate;
import resources.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class IFrameDate extends Base {
    @BeforeTest
    public void htmlTableNavigation() throws IOException {
        driver = initializeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/datepicker/");
        iFrameDate ifd=new iFrameDate(driver);
        ifd.Iframe().click();
        driver.switchTo().frame(ifd.Iframe());
    }
    @Test
    public void DatePicking(){
        iFrameDate ifd=new iFrameDate(driver);
        ifd.DatePickerClick().click();
        boolean x=ifd.Compare().getText().contains("April");
       while(x){
           ifd.ClickNext().click();
       }
       int count=ifd.Dates().size();
        for(int i=0;i<count;i++){
            String text=ifd.Dates().get(i).getText();
            if(text.equalsIgnoreCase("21"))
            {
                ifd.Dates().get(i).click();
                break;
            }
        }
    }
}
