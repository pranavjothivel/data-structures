import java.util.ArrayList;

public class ArrayListStack<E> implements StackADT<E> {
    private final ArrayList<E> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    public void push(E element) {
        stack.add(element);
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}