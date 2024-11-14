import java.util.EmptyStackException;

public class IntegerArrayStack implements StackADT<Integer> {
    private int[] stack;
    private int top = -1;

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

    public void push(Integer element) {
        ensureCapacity();
        stack[top++] = element;
    }

    public Integer pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public Integer peek() {
        return 0;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return 0;
    }
}
