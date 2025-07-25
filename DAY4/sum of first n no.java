public class printnto1 {
  public static void main(String[] args) {
    
    sum(5);
  }
  
  public static void sum(int n){
    int sum1=0;
    for(int i=1;i<=n;i++){
       sum1 +=i;
    }
    System.out.println(sum1);   
  }
}
