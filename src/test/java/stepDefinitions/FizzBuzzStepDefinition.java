package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.FizzBuzzConverter;

public class FizzBuzzStepDefinition {
    @Given("^enter the numbers$")
    public void enter_the_numbers() throws Throwable {
        FizzBuzzConverter fbc=new FizzBuzzConverter();
        Assert.assertEquals("1",fbc.convert(1));
        Assert.assertEquals("2",fbc.convert(2));
        Assert.assertEquals("3",fbc.convert(3));
        Assert.assertEquals("4",fbc.convert(4));
    }
    @When("^perform the operation for 5,7 and 35$")
    public void perform_the_operation_for_57_and_35() throws Throwable {
        FizzBuzzConverter fbc = new FizzBuzzConverter();
        Assert.assertEquals("fizz", fbc.convert(5));
        Assert.assertEquals("buzz", fbc.convert(7));
        Assert.assertEquals("fizzbuzz", fbc.convert(35));
    }
    @Then("^print the fizbuzz is performed succesfully$")
    public void print_the_fizbuzz_is_performed_succesfully() throws Throwable {
    }
    @And("^get the output$")
    public void get_the_output() throws Throwable {
        FizzBuzzConverter fizzBuzz=new FizzBuzzConverter();
        for(int i=1;i<=10;i++)
            System.out.println(fizzBuzz.convert(i));
    }
}
