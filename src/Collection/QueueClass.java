package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {

        //create
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        //Read
        System.out.println("Queue : "+queue);

        //update(Not directly possible reinsert element
        queue.poll();
        queue.add(40);
        System.out.println("After update : "+queue);

        //Delete
        queue.remove(20);
        System.out.println("After deletion : "+queue);
    }
}
