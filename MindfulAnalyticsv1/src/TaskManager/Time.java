package TaskManager;
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
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter HourFormat = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter MinuteFormat = DateTimeFormatter.ofPattern("mm");
        String Htext = HourFormat.format(date);
        String Mtext = MinuteFormat.format(date);
        int hour = Integer.parseInt(Htext);
        int minute = Integer.parseInt(Mtext);
        Time t = new Time(minute, hour);
        return t;
    }
    public void printTime() {
        System.out.print(Hour);
        System.out.print(":");
        System.out.print(Minute);
        System.out.println(' ');
    }

    public static void main(String[] args) {
        Time c = currentTime();
        c.printTime();
    }
}
