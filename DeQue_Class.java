import java.util.ArrayDeque;

/*
 *  De - Queue: we can perform both point means (Start and End) insertion and delete operation.
 */
public class DeQue_Class {
    public static void main(String[] args){
        ArrayDeque<Integer>  adp = new ArrayDeque<Integer>();
        adp.offer(30);
        adp.offer(20);
        adp.offer(10);
        adp.offer(5);
        adp.offerFirst(40);
        adp.offerLast(2);
        System.out.println(adp);
        System.out.println(adp.poll());
        System.out.println(adp);
        System.out.println(adp.pollFirst());
        System.out.println(adp);
        System.out.println(adp.pollLast());
        System.out.println(adp);
    }
}
