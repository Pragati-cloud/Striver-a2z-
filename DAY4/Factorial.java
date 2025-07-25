public abstract class factorial {
  public static void main(String[] args) {
    System.out.println(factorialn(4));
  }
  public static int factorialn(int n){

    if(n==0) return 1;

    return n* factorialn(n-1);
  }
}
