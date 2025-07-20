//link -https://www.naukri.com/code360/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM

public class Solution {
    public static void seeding(int n) {
       for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
