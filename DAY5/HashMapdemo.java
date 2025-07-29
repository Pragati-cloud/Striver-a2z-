import java.util.*;

public class Hasingdemo{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.err.println("enter num :");
    int n;
   
    n=sc.nextInt();
    int[]arr= new int[n];

     System.out.println("enter array element");
    for(int i =0; i<n;i++){
      
      arr[i] = sc.nextInt();
    }

    //precompute

    HashMap<Integer,Integer> mp = new HashMap<>();
    for(int i =0; i<n;i++){
      int key = arr[i];
      int freq=0;
      if(mp.containsKey(key)) freq =mp.get(key);
      freq++;
      mp.put(key,freq);
    }

    int q;
    System.out.println("enter q");
    q=sc.nextInt();
    while(q-- >0){
      int num;
      num = sc.nextInt();
      //fetch
      if(mp.containsKey(num)) System.out.println(mp.get(num));
      else System.out.println(0);
    }
    sc.close();
  }
  
}
