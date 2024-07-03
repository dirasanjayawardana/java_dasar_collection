package dirapp;

import java.util.Queue;

import dirapp.collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        
        // jika ingin membuat collection manual, bisa menggunakan abstract class yang sudah disediakan
        // AbstractCollection --> untuk membuat collection
        // AbstractList --> untuk membuat List
        // AbstractMap --> untuk membuat Map
        // AbstractQueue --> untuk membuat Queue
        // AbstractSet --> untuk membuat Set

        Queue<String> queue = new SingleQueue<>();
        System.out.println(queue.size());

        System.out.println(queue.offer("Dira"));
        System.out.println(queue.offer("Sanjaya"));
        System.out.println(queue.offer("Wardana"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
