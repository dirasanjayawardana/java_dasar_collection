package dirapp;

import java.util.Deque;
import java.util.LinkedList;

public class KDequeApp {
    public static void main(String[] args) {

        // Deque (Double ended queue) adalah queue yang bisa beroperasi dari depan atau belakang
        // Deque mendukung FIFO (First In First Out), LIFO (Last In First Out)
        // Deque adalah implementasi struktur data antrian dan stack (tumpukan)
        // Deque adalah turunan dari Queue, semua method di Queue bisa dipakaim untuk membuat object Deque bisa gunakan LinkedList() atau ArrayDeque() 

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Dira");
        stack.offerLast("Sanjaya");
        stack.offerLast("Wardana");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Dira");
        queue.offerLast("Sanjaya");
        queue.offerLast("Wardana");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}

// Beberapa method pada Interface Deque
// void addFirst(E e);
// void addLast(E e);
// boolean offerFirst(E e);
// boolean offerLast(E e);
// E removeFirst();
// E removeLast();
// E pollFirst();
// E pollLast();
// E getFirst();
// E getLast();
// E peekFirst();
// E peekLast();
// boolean removeFirstOccurrence(Object o);
// boolean removeLastOccurrence(Object o);
// boolean add(E e);
// boolean offer(E e);
// E remove();
// E poll();
// E element();
// E peek();
// boolean addAll(Collection<? extends E> c);
// void push(E e);
// E pop();
// boolean remove(Object o);
// boolean contains(Object o);
// int size();
// Iterator<E> iterator();
// Iterator<E> descendingIterator();
