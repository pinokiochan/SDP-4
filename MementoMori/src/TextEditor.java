import java.util.Scanner;

class TextEditor {
    private String text = ""; // Initialize the text variable
    private History history;

    public TextEditor() {
        history = new History();
    }

    public void type(String input) {
        text += input; // Append input to existing text
    }

    public void save() {
        history.save(new Memento(text));
    }

    public void undo() {
        Memento memento = history.undo();
        if (memento != null) {
            text = memento.getText();
        } else {
            System.out.println("No states to undo.");
        }
    }

    public void display() {
        System.out.println("Current text: " + text); // Display the current text
    }
}
