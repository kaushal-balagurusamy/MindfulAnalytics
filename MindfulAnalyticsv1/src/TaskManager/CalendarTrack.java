package TaskManager;
import java.util.Calendar;

public class CalendarTrack {

    /** FRONT END CLASS
     * DESIGN:
     *      • Create 3 main sub-classes in this class: dayView, weekView, and monthView
     *          • once you make these make sure to make them fields of CalendarTrack
     *      • Use Dayslot class
     *      • These classes are stored in this bigger object so that switching between views is seamless
     *          since the instantiation of a calendar view creates all 3 views at the same time
     *      • Each can have the following fields
     *          • TaskList field to store the tasks
     *          • Dayslot[] of how many ever days are in the view (1,7,or X depending on which month it is)
     *              • that implies a method that can use the built in calendar class to pull the number of days in a particular month
     *                  and do that calculation for initializing this field
     * @param day
     * @param month
     * @param year
     * @return
     */

    // This gets the calendar date for the current day. I understand that there is an operation for this in Data.java but
    // we can communicate between the two classes since there is a built-in calendar class
    public Calendar getCalendar (int day, int month, int year){
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month+1);
        date.set(Calendar.DAY_OF_MONTH, day);
        return date;
    }

    ///For each date in the calendar object, we want to have a 24 hour time period split into 15 minutes each. The best way
    // to implement this will probably be through an array class

    /*
    Dayslot is a field of 96 timeslots in a single day because there are 480 5 minute periods in a day and different tasks can take up
    different times in those periods, hence just fill the array. In the Date.java class, each date now has a DaySlot Field
    */

    public class DaySlot{}{
        int[] TimeSlots = new int[96];

        for (int i=0; i<TimeSlots.length; i++){
            TimeSlots[i] = i+1;
        }
    }

























}
