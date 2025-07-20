//Problem statement
//Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

//For every value of ‘N’, help sam to print the corresponding N-dimensional forest.

//Example:
//Input: ‘N’ = 3

//Output: 
* * *
* * *
* * *


// LINK = https://www.naukri.com/code360/problems/n-forest_6570177?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
//  Solution

public class Solution {
    public static void nForest(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
