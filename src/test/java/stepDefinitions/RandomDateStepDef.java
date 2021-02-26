package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateStepDef {
    @Given("^Take the week range and number of days$")
    public void take_the_week_range_and_number_of_days() throws Throwable {
        System.out.println("enter range of weeks");
    }
    @When("^Take the starting date and ending , starting day as local date and perforn random operation$")
    public void take_the_starting_date_and_ending_starting_day_as_local_date() throws Throwable {
        int givenWeek = 2;
        System.out.println(givenWeek);
        int days = givenWeek * 7;
        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay();
        LocalDate endDate = LocalDate.now().plusDays(days);
        System.out.println(endDate);
        long end = endDate.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        System.out.println(LocalDate.ofEpochDay(randomEpochDay));
    }
    @Then("^Print the random Date$")
    public void print_the_random_date() throws Throwable {
        System.out.println("RandomWeekDay Date is correctly picked");
    }

}
