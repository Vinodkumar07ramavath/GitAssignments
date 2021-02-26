package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeekDayStepDef {
    @Given("^Take the current Date$")
    public void take_the_current_date() throws Throwable {
        Date date=new Date();
    }
    @When("^Then change the current date day into integer and perform switch case and print the current date is weekday or Holiday$")
    public void then_change_the_current_date_day_into_integer_and_perform_switch_case_and_print_the_current_date_is_weekday_or_holiday() throws Throwable {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("u");
        String x=sdf.format(date);
        int i=Integer.parseInt(x);
        switch(i) {
            case 1:
                System.out.println("It is WorkingDay today!: MONDAY");
                break;
            case 2:
                System.out.println("It is WorkingDay today!: TUESDAY");
                break;
            case 3:
                System.out.println("It is WorkingDay today!: WEDNESDAY");
                break;
            case 4:
                System.out.println("It is WorkingDay today!: THURSDAY");
                break;
            case 5:
                System.out.println("It is WorkingDay today! : FRIDAY");
                break;
            case 6:
                System.out.println("It is Holiday today! : SATURDAY");
                break;
            case 7:
                System.out.println("It is Holiday today! : SUNDAY");
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
    @Then("^print the correctlly printed or not$")
    public void print_the_correctlly_printed_or_not() throws Throwable {
    }
}
