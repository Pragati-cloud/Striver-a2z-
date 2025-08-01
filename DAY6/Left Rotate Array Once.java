import java.util.Arrays;

public class Leftrotate {
  public static void main(String[] args) {
    int[] arr= {34,54,3,52,45,453};
    int n = arr.length;

    int temp = arr[0];
    for(int i =1; i<n;i++){
       arr[i-1]= arr[i];
    }
    arr[n-1]=temp;
    System.out.println(Arrays.toString(arr));
  }
  
}
