/*
This file is the entry point to my todo list app
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 4;
        System.out.println("Welcome to do CLI to do list!");
        System.out.println("Enter 0 to exit, 1 to create new task, 2 to mark toggle done or not done, 3 to display all tasks.");
        ArrayList<Task> taskList= new ArrayList<>();

        while (input != 0) {
            if (input == 1) {
                System.out.println("Enter description: ");
                scanner.nextLine();
                String desc = scanner.nextLine();
                Task t = new Task(desc);
                System.out.println(t);
                taskList.add(t);
                System.out.println("Task added successfully");
            }
            if (input == 2) {
                Task.displayTasks(taskList);
                System.out.println("Choose which task to toggle done.");
                int taskInput = scanner.nextInt();
                int index = taskInput-1;
                Task selected = taskList.get(index);
                selected.toggleDone();
                System.out.println("Updated" + selected);
            }
            if (input == 3) {
                Task.displayTasks(taskList);
            }
            input = scanner.nextInt();
        }
    }
}