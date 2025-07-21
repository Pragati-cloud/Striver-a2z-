import java.util.Stack;

public class Stackpractice {
   public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();

      st.push(1);
      st.push(22);
      st.push(57);
      st.push(300);
      st.push(84);

      System.out.println("Stack :" + st);
      System.out.println(st.peek());

      st.pop();
      System.out.println(st);
   }
}
