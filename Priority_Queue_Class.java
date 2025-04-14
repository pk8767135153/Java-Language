import java.util.Comparator;
import java.util.PriorityQueue;

/*
* Priority Queue : it has binary tree structure.
*           In C++ by default Priority queue is max-heap.
*           In java by default priority queue is min-heap.
*/
public class Priority_Queue_Class {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap priority
       // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max-heap priority
        pq.offer(23);
        pq.offer(3);
        pq.offer(1);
        pq.offer(43);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
