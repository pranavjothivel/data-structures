import java.util.LinkedList;

public class LinkedListStack<E> implements StackADT<E> {
    private final LinkedList<E> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
}
