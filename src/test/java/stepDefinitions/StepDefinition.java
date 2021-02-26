package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import pageObject.htmlTable;
import pageObject.iFrameDate;
import resources.Base;

public class StepDefinition extends Base {
    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        driver = initializeDriver();
    }

    @When("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        driver.get(strArg1);
    }
    @And("^Get the row count ,columcount and table data$")
    public void get_the_row_count_columcount_and_table_data() throws Throwable {
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
    @Then("^Table printed succesfully$")
    public void Table_printed_succesfully() {
        System.out.println("The table data printed succesfully");
    }
}
