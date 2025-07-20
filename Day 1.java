//Time Complexity  -  Rate at which the time taken increases with respect to the input size.

//1. TC , worst case
//2 . avoid constants
//3. avoid lower values

public class Day1 {

  public static void main(String[] args) {  //soo the time complexity is O(N square)
    for( int i=0; i<5 ; i++){
      for(int j=0; j<5;j++){
        System.out.print(i+j);
      }
      System.out.println(" ");
    }
  }
}


// Big-Oh (O) - worst case (upper - bound)
//Theta 0  - average     
//Omega() - worst bound


//Space complexity the memory space program takes
// Axialary Space - The space u take to store problem
// +
// Input Space - The space in which input are stored.
