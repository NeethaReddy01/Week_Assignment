package day4Tasks;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> queue;
    
    public Queue() {
        queue = new ArrayList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    
    public int size() {
        return queue.size();
    }

    
    public void printQueue() {
        System.out.println(queue);
    }
}

