package vinodkumar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.htmlTable;
import resources.Base;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HtmlTable extends Base {
    public static Logger log= LogManager.getLogger(Base.class.getName());
    @Test
   public void htmlTableNavigation() throws IOException {
        driver = initializeDriver();
        log.info("driver is initialized");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        log.info("Browser is opened");
        htmlTable ht=new htmlTable(driver);
        int z=ht.RowCount().size();
        int v=ht.ColumCount().size();
        for(int i=1;i<=z;i++){
            for(int j=1;j<=v;j++){
                System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/*[" + j + "]")).getText() + "  ");
            }
            System.out.println();
        }
    }
}