import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuedemo {

  public static void main(String[] args) {

    //it construct min heap internally , if wanna reverse use  "Comparator.reverseOrder()"
    Queue<Integer> pq= new PriorityQueue<>();

    pq.offer(73);
    pq.offer(300);
    pq.offer(583);
    pq.offer(85);
    pq.offer(72);
    pq.offer(55);

    System.out.println(pq);

    pq.poll();
    System.out.println(pq);

    System.out.println(pq.peek());
  }
   
}

