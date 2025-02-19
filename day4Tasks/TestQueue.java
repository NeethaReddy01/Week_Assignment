package day4Tasks;

public class TestQueue {
    public static void main(String[] args) {
        
        Queue<Integer> intQueue = new Queue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        System.out.println("Integer Queue:");
        intQueue.printQueue();

        System.out.println("Dequeued: " + intQueue.dequeue());
        intQueue.printQueue(); 
       
        Queue<Float> floatQueue = new Queue<>();
        floatQueue.enqueue(10.5f);
        floatQueue.enqueue(20.5f);
        System.out.println("Float Queue:");
        floatQueue.printQueue();
       
        System.out.println("Dequeued: " + floatQueue.dequeue());
        floatQueue.printQueue();

        Queue<Double> doubleQueue = new Queue<>();
        doubleQueue.enqueue(100.1);
        doubleQueue.enqueue(200.2);
        doubleQueue.enqueue(300.3);
        System.out.println("Double Queue:");
        doubleQueue.printQueue();

        System.out.println("Dequeued: " + doubleQueue.dequeue());
        doubleQueue.printQueue();

        Queue<String> stringQueue = new Queue<>();
        stringQueue.enqueue("Alice");
        stringQueue.enqueue("Bob");
        stringQueue.enqueue("Charlie");
        System.out.println("String Queue:");
        stringQueue.printQueue();

        System.out.println("Dequeued: " + stringQueue.dequeue());
        stringQueue.printQueue();
    }
}
