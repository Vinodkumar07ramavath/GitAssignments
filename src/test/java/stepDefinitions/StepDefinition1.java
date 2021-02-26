package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.iFrameDate;
import resources.Base;

public class StepDefinition1 extends Base {
    @Given("^initialize the browser through chrome$")
    public void initialize_the_browser_through_chrome() throws Throwable {
        driver = initializeDriver();
    }

    @When("^Navigate to this \"([^\"]*)\" site$")
    public void navigate_to_this_something_site(String strArg2) throws Throwable {
        driver.get(strArg2);
    }
    @And("^select the user required month and from that select the required date$")
    public void select_the_user_required_month_and_from_that_select_the_required_date() throws Throwable {
        iFrameDate ifd=new iFrameDate(driver);
        ifd.Iframe().click();
        driver.switchTo().frame(ifd.Iframe());
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
    @Then("^the date is succesfully picked$")
    public void the_date_is_succesfully_picked() throws Throwable {
        System.out.println("The Date is succesfully picked");
    }
}
