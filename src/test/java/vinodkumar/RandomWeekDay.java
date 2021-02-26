package vinodkumar;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class RandomWeekDay {
    Scanner sc = new Scanner(System.in);
@Test
    public void RandomWeekdays() throws IOException {
        LocalDate today = LocalDate.now();
        long todayDate = today.toEpochDay();
        System.out.println("Todays Date: " + today);
        System.out.println("Enter No of weeks:");
        int  weekRange =2;
        System.out.println(weekRange);
        LocalDate nextWeek = today.plusWeeks(weekRange);
        long  nextweek = nextWeek.toEpochDay();
        System.out.println("Next Week Range Date: " + nextWeek);
        long random = ThreadLocalRandom.current().nextLong(todayDate, nextweek);
        System.out.println("RandomWeekDay Date: " + LocalDate.ofEpochDay(random));
        System.out.println("Day: " + LocalDate.ofEpochDay(random).getDayOfWeek());
    }
}
