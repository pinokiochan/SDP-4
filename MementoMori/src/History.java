import java.util.Stack;

class History {
    private Stack<Memento> mementos = new Stack<>();

    public void save(Memento memento) {
        mementos.push(memento);
    }

    public Memento undo() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }else{
            return null;
        }
    }
}
