import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            if (command.equals("list")) {
                todoList.print();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int no = Integer.valueOf(scanner.nextLine());
                todoList.remove(no);
            }
        }
    }
}

