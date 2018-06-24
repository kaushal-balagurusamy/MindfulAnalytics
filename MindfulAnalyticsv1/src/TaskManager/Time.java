package TaskManager;
import java.sql.SQLOutput;
import java.time.*;
import java.time.format.*;
public class Time {
    int Minute;
    int Hour;
    Time(int m, int h) {
        Minute = m;
        Hour = h;
    }

    public static Time currentTime() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter HourFormat = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter MinuteFormat = DateTimeFormatter.ofPattern("mm");
        String Htext = date.format(HourFormat);
        String Mtext = date.format(MinuteFormat);
        int hour = Integer.parseInt(Htext);
        int minute = Integer.parseInt(Mtext);
        Time t = new Time(minute, hour);
        return t;
    }
    public void printDate() {
        System.out.print(Hour);
        System.out.print(":");
        System.out.print(Minute);
        System.out.println(' ');
    }
}
