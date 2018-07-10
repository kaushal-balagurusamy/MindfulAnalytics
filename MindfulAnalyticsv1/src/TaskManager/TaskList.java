package TaskManager;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskList implements Iterable<Task> {
    /**
     * Design:
     *  • Lightweight list of tasks that's resizable and supports for-each iteration
     *  • streamlines accessing tasks and will form basis of a list view that uses this class
     *  • to clarify this class itself should not contain the code for the front end list view
     */
    public class taskIterator implements Iterator<Task> {
        int index = 0;
        public boolean hasNext() {
            return index < tasks.size();
        }

        public Task next() {
            if (hasNext()) {
                index++;
                return tasks.get(index-1);
            }
            return null;
        }
    }
    public Iterator<Task> iterator() {
        return new taskIterator();
    }

    ArrayList<Task> tasks = new ArrayList<>();


    void addTask(Task t) {
        tasks.add(t);
    }

    void removeTask(Task t) {
        tasks.remove(t);
    }

    Task getTask(int i) {
        return tasks.get(i);
    }

    int size() {
        return tasks.size();
    }


    public static void main(String[] args) {
        Task t1 = new Task(Date.currentDate(), "Kaushal", " ", " ", Time.currentTime(), Time.currentTime());
        Task t2 = new Task(Date.currentDate(), "Johnathan", " ", " ", Time.currentTime(), Time.currentTime());
        Task t3 = new Task(Date.currentDate(), "Garry", " ", " ", Time.currentTime(), Time.currentTime());

        TaskList tlist = new TaskList();
        tlist.addTask(t1);
        tlist.addTask(t2);
        tlist.addTask(t3);

        for (Task e : tlist) {
            System.out.println(e.title);
        }

    }



}
