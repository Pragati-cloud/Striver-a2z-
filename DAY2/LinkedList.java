import java.util.*;

public class LinkedListdemo {
  public static void main(String[] args) {
    
    // can be implemented with list and queue

    Queue<Integer> ll= new LinkedList<>();

    // we can use add , remove , element instead of offer, poll and peek but it throw exception when th e statement return false
    ll.offer(34);
    ll.offer(300);
    ll.offer(583);
    ll.offer(85);
    ll.offer(72);
    ll.offer(55);

    System.out.println(ll);

    ll.poll();
    System.out.println(ll);

    System.out.println(ll.peek());
  }
}
