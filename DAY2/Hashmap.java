import java.util.Map;

import java.util.*;

public class HashMapDemo {
  public static void main(String[] args) {
    
    Map<Integer, String> mp = new HashMap<>();

    // Map<Integer, String> mp = new TreeMap<>(); for sorting keys

    //keys are always unique
    mp.put(2, "two");
    mp.put(3, "three");
    mp.put(4, "four");
    mp.put(5, "five");


    System.out.println(mp);

    System.out.println(mp.containsKey(4));
    System.out.println(mp.isEmpty());

    for(Map.Entry<Integer, String> e: mp.entrySet()){
      System.out.println(e);
      System.out.println(e.getValue());
      System.out.println(e.getKey());
    }
  }
}
