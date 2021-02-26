package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomWeekDayStepDef {

    @Given("^Take the week range and number of days from the user$")
    public void take_the_week_range_and_number_of_days() throws Throwable {
        int weekRange=2;
        System.out.println("Enter the weekrange:" +weekRange);
    }

    @When("^Take the starting date and ending,starting day as local date and perforn random operation$")
    public void take_the_starting_date_and_ending_starting_day_as_local_date_and_perforn_random_operation() throws Throwable {
        int  weekRange =2;
        LocalDate today = LocalDate.now();
        long todayDate = today.toEpochDay();
        System.out.println("Todays Date: " + today);
        System.out.println("Enter No of weeks:");
        LocalDate nextWeek = today.plusWeeks(weekRange);
        long  nextweek = nextWeek.toEpochDay();
        System.out.println("Next Week Range Date: " + nextWeek);
        long random = ThreadLocalRandom.current().nextLong(todayDate, nextweek);
        System.out.println("RandomWeekDay Date: " + LocalDate.ofEpochDay(random));
        System.out.println("Day: " + LocalDate.ofEpochDay(random).getDayOfWeek());
    }

    @Then("^Print the random WeekDate$")
    public void print_the_random_weekdate() throws Throwable {
        System.out.println("The RandomWeekDay is printed");
    }

}
