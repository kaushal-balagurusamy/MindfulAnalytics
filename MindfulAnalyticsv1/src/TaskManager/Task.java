package TaskManager;

public class Task {
    /*
    ********maybe use interface inheritence from events for this idk
    DESIGN:
        Essentially I want to find the perfect middle ground for what's too much data to be
        associated with a task, and what's too little. The middle point will expedite
        processes that require certain generic data that every task should travel with.
        Other fields are probably auxiliary and can just be thrown on top
    Fields:
        • Creation Date
        • Due Date
        • Description
        • Title
        • Category
    Methods:
        • clear task
        • constructor
        • add description
        • add category
        • change date
    */
    private final Date creationDate;
    Date dueDate;
    String title;
    String description;
    String category;

    //constructor
    Task(Date c, Date d, String t, String de, String ca) {
        creationDate = c;
        dueDate = d;
        title = t;
        description = de;
        category = ca;
    }

    void updateTask(Date d, String t, String de, String ca) {
        dueDate = d;
        title = t;
        description = de;
        category = ca;
    }




}