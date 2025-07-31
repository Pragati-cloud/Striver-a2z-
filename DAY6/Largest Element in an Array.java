import java.util.Arrays;
import java.util.Scanner;

public class Largestelement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] arr = new int[6];
    for(int i =0; i<6;i++){
      arr[i]= sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    Largeelem1(arr);
    Largeelem2(arr);

  }

  public static void Largeelem1(int[] arr){
    // Brute force 
    Arrays.sort(arr);
    int n =arr.length;
    System.out.println(arr[n-1]);
  }
  public static void Largeelem2(int[] arr){
    //optimal

    int max = arr[0];
    int n =arr.length;
    for(int i =1; i<n ;i++){
        if(max <arr[i]) max=arr[i];
    }
    System.out.println(max);
  }
}
