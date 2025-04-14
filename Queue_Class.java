/*
*  Queue :
*           It is interface
*           PriorityQueue is class
*           Queue working by using FIFO & LILO Principle
*
* // offer() :-> if we use add method queue there is change
* it will throw execution but if we use offer()
* it will check we add the specific value inside
*  the queue means it will return True(value is added)
* of False(value not added)
*
*
* // poll() :-> if we use remove() inside queue
*  if remove cannot remove the element inside
* the queue it will throw exception if we used
* poll it will return null value
*
*/

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Class {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(20);
        queue.offer(30);
        queue.offer(100);
        queue.add(50);
        System.out.println(queue);
        // Don't use remove. if it will be unable to
        // remove value that time it will throw exception.
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
