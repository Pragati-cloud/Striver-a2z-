import java.util.ArrayList;
import java.util.*;

public class JavaCollection {
    public static void main(String[] args) {
      
      List<String> lst = new ArrayList<>();

      lst.add("hhelo");
      lst.add("sneha");
      lst.add("shubha");
      lst.add("archit");

      System.out.println(lst);

      lst.add("bittu");
      lst.add(2,"cute");  //add in specific index
      System.out.println(lst);

      lst.set(4, "pretty");

      System.out.println(lst);

      System.out.println(lst.contains("cute"));


      // addAll used to add one list in another (merge both list)

      System.out.println(lst.get(3));

      lst.remove(4);

      lst.remove(String.valueOf("hhelo"));
      System.out.println(lst);

      lst.clear();
      System.out.println(lst);
    }
}
