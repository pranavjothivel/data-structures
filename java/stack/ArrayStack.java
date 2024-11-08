package java.stack;

import java.util.ArrayList;

public class ArrayStack<E> implements StackADT<E> {
    public int top = -1;
    // using ArrayList with fixed size to mimic array
    public ArrayList<E> stack;

    public ArrayStack() {
        this(100);
    }
    
    public ArrayStack(int size) {
        stack = new ArrayList<E>(size);
    }

    private void ensureCapacity() {
        if (top == stack.size() - 1) {
            stack.ensureCapacity(stack.size() * 2);
        }
    }

    public void push(E element) {
        ensureCapacity();
        stack.add(++top, element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(top--);
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
