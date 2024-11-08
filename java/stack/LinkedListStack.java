package java.stack;
import java.util.LinkedList;

public class LinkedListStack<E> implements StackADT<E> {
    private LinkedList<E> list;

    public LinkedListStack() {
        list = new LinkedList<E>();
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
}
