package TaskManager;
public class Task {
    /**
    DESIGN:
        • Building block of the program
        • Calendar view/pie chart view/list view will all share task objects from a task list
        • this creates space efficient storage and modification of tasks, change one, change all
        • these objects carry all info common to every view (some views may have other information
            pertaining/calculated from a task's fundamental fields that we don't need other classes
            to have access to
    Fields:
        • Creation Date
        • Due Date
        • Description
        • Title
        • Category
    Methods:
        • clear task
        • constructor
        • update fields
        • change date
    */
    private final Date creationDate;
    Date dueDate;
    String title;
    String description;
    String category;
    Time startTime;
    Time endTime;

    //constructor
    Task(Date d, String t, String de, String ca, Time st, Time et) {
        creationDate = Date.currentDate();
        dueDate = d;
        title = t;
        description = de;
        category = ca;
        startTime = st;
        endTime = et;
    }

    void changeStartTime(Time t) {
        startTime = t;
    }

    void changeEndTime(Time t) {
        endTime = t;
    }

    void updateDueDate(Date d) {
        dueDate = d;
    }

    void updateTitle(String t) {
        title = t;
    }
    void updateDescription(String d) {
        description = d;
    }
    void updateCategory(String c) {
        category = c;
    }



}
