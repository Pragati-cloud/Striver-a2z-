import java.util.*;

public class Setdemo {
  public static void main(String[] args) {
    
    //the elements shows are in random order
    Set<Integer> st = new HashSet<>();  // Big O(1)

    //the elements shows in squentially order how they added 
    //Set<Integer> st = new LinkedHashSet<>();

    //the elements shows are in ascendeing order
    //Set<Integer> st = new TreeSet<>();  ( Big O(logN))


      st.add(35);
      st.add(46);
      st.add(67);
      st.add(568);
      st.add(43);

      System.out.println(st);

      //st.remove() , st.size(), st.contains() , st.isEmpty()
  }
}
