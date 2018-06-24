package TaskManager;

import java.time.*;
import java.time.format.*;
public class Date {

    int Year;
    int Month;
    int Day;
    //creates new date and sets it to class's year, month, and day values.
    Date(int m, int y, int d) {
        Year = y;
        Month = m;
        Day = d;
    }

    //Finds Current Date. You can make a new date and set it to this value.
    // EX: Date d = currentDate();
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

    //prints date
    //EX: Date c = new Date(12, 2018, 4);
    //    c.printDate();
    public void printDate() {
        System.out.print(Month);
        System.out.print("/");
        System.out.print(Day);
        System.out.print("/");
        System.out.print(Year);
        System.out.println(' ');

    }

    public static void main(String args[]) {
        Date c = currentDate();
        Date e = new Date(12, 2019, 12);
        e.printDate();
        c.printDate();

    }
}
