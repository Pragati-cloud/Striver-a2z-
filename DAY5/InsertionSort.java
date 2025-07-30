public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {34,5,53,7,43,87,39,54,6,1};
    Sort(arr);
    for( int i =0;i<=arr.length ; i++){
      System.out.println(arr[i]);
    }
    
  }
  public static void Sort(int[] arr){
     int n =arr.length;
    
     for(int i =1; i<=n-1;i++){
      int j=i;
      while(j>0 && arr[j-1]>arr[j]){
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j]=temp;
        j--;
      }
      
     }
    
  }
}
