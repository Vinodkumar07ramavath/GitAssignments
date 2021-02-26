package vinodkumar;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
public class WorkingDayOrHoliDay {
    @Test
    public void WorkingDay(){
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
}
