package main.Lab_30;

public interface Queue<E> {
    E remove();
    E poll();
    E element();
    E peek();
    boolean add(E element);
    boolean offer(E element);
}
