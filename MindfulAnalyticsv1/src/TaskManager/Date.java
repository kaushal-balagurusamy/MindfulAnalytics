package TaskManager;
import java.sql.SQLOutput;
import java.time.*;
import java.time.format.*;
public class Date {

    int Year;
    int Month;
    int Day;
    Date(int m, int y, int d) {
        Year = y;
        Month = m;
        Day = d;
    }


    public static Date currentDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter DayFormat = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter MonthFormat = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter YearFormat = DateTimeFormatter.ofPattern("yyyy");
        String Dtext = date.format(DayFormat);
        String Mtext = date.format(MonthFormat);
        String Ytext = date.format(YearFormat);
        int day = Integer.parseInt(Dtext);
        int month = Integer.parseInt(Mtext);
        int year = Integer.parseInt(Ytext);
        Date d = new Date(month, year, day);
        return d;
    }


    public void printDate() {
        System.out.print(Month);
        System.out.print("/");
        System.out.print(Day);
        System.out.print("/");
        System.out.print(Year);

    }

    public static void main(String args[]) {
        Date c = currentDate();
        c.printDate();

    }
}
