package java.stack;

public interface StackADT<E> {
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
}
