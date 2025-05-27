import java.util.ArrayList;
import java.util.List;

/*
 This file defines what a task is and takes care of functionality of the tasks.
 */
public class Task {
    private String description;
    private boolean isDone;
    private ArrayList<Task> taskList = new ArrayList<>();

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void toggleDone() {
        if (this.isDone) {
            this.isDone = false;
        } else {
            this.isDone = true;
        }
    }

    public static void displayTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.print(i+1 + " ");
                System.out.println(tasks.get(i));
            }
        }

    }

    public String toString() {
        return (isDone() ? "[X] " : "[ ] ") + description;
    }
}
