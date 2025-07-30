public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {34,5,53,7,43,87,39,54,6,1};
    Sort(arr);
    for( int i =0;i<=arr.length ; i++){
      System.out.println(arr[i]);
    }
    
  }
  public static void Sort(int[] arr){
     int n =arr.length;
     
    for(int i =n-1;i>=1;i--){
      for(int j =0; j<i;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]= arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    
  }
}
