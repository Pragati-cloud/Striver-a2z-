public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {34,5,53,7,43,87,39,54,6,1};
    Sort(arr);
    for( int i =0;i<=arr.length ; i++){
      System.out.println(arr[i]);
    }
    
  }
  public static void Sort(int[] arr){
     int n =arr.length;
     
    for(int i =0; i<n; i++){
      int min =i;
      for(int j =i; j<n; j++){
         if(arr[j]<arr[min]) min =j;
      }
      int temp = arr[min];
      arr[min] =arr[i];
      arr[i] =temp;
    }
    
  }
}
