package TaskManager;
import java.util.Calendar;

public class CalendarTrack {

    // This gets the calendar date for the current day //
    public Calendar getCalendar (int day, int month, int year){
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month+1);
        date.set(Calendar.DAY_OF_MONTH, day);
        return date;
    }

    


}
