package clase6;

public class QueueTester {
    public static void main(String[] args) {
        Queue<Integer> queue = new QueueImpl<>();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        for(Integer elem : queue) {
            System.out.print(elem + " ");
        }
    }
}
