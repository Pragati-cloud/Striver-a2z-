import java.util.ArrayDeque;

public class ArrayDequedemo {
   public static void main(String[] args) {
      ArrayDeque<Integer> ar=new  ArrayDeque<>();

     // It allow insertion and deletion from both end. Resizable array

      ar.offer(98);
      ar.offer(68);
      ar.offer(35);
      ar.offer(62);
      ar.offer(905);

      System.out.println(ar);

      ar.offerLast(100);
      ar.offerFirst(1);

      System.out.println(ar);

      System.out.println(ar.poll());
      System.out.println("array: "+ ar);

      System.out.println(ar.pollLast());
      System.out.println("array: "+ ar);

      System.out.println(ar.pollFirst());
      System.out.println("array: "+ ar);

      System.out.println(ar.peek());
      System.out.println(ar.peekFirst());
      System.out.println(ar.peekLast());
   }
}
