package java.stack;

public class IntegerArrayStack {
    private int top = -1;
    private int[] stack;

    public IntegerArrayStack() {
        this(100);
    }

    public IntegerArrayStack(int size) {
        stack = new int[size];
    }

    public void ensureCapacity() {
        if (top == stack.length - 1) {
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
    }

    public void push(int element) {
        ensureCapacity();
        stack[++top] = element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
