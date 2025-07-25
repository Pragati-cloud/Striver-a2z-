//link -https://takeuforward.org/recursion/print-1-to-n-using-recursion/

public class printnto1 {
  public static void main(String[] args) {
    printthis(1);
    printrev(5);
  }
  public static void printthis(int n){
    if(n==4) return;

    System.out.println("hello");
    
    printthis(n+1);
  }
  public static void printrev(int n){
    if(n==0) return;

    System.out.println(n);
    
    printrev(n-1);
  }
}
