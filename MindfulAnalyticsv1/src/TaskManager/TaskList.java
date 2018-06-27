package TaskManager;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskList implements Iterable<Task> {
    /*
    Create an event (for Calendar)
        • task field
        •
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
