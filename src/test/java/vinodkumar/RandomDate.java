package vinodkumar;
import org.testng.annotations.Test;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {
    @Test
    public void RandomDates(){
        System.out.println("enter range of weeks");
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
}
