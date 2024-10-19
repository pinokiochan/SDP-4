import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter text (or 'save' to save, 'undo' to undo, 'exit' to quit):");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("save")) {
                editor.save();
                System.out.println("Current state saved.");
            } else if (command.equalsIgnoreCase("undo")) {
                editor.undo();
                System.out.println("Last change undone.");
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                editor.type(command + "\n");
            }

            editor.display();
        }

        scanner.close();
    }
}
