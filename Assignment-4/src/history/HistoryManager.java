package history;

public class HistoryManager<T> {
    private Node<T> current;

    public void addState(T data) {
        Node<T> newNode = new Node<>(data);
        if (current != null) {
            current.next = null;
            newNode.prev = current;
            current.next = newNode;
        }
        current = newNode;
    }

    public boolean canUndo() {
        return current != null && current.prev != null;
    }

    public boolean canRedo() {
        return current != null && current.next != null;
    }

    public T undo() {
        if (canUndo()) {
            current = current.prev;
            return current.data;
        }
        throw new IllegalStateException("Nothing to undo!");
    }

    public T redo() {
        if (canRedo()) {
            current = current.next;
            return current.data;
        }
        throw new IllegalStateException("Nothing to redo!");
    }

    public T getCurrentState() {
        return current != null ? current.data : null;
    }
}