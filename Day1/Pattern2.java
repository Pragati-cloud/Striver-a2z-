//LInk = http://naukri.com/code360/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class Solution {
    public static void nForest(int n) {
       for(int i=0;i<n;i++){
		for(int j=0;j<=i;j++){

			System.out.print("*");
            if (j != i) {
                    System.out.print(" ");
                }
			
		}
		System.out.println();
	}

    }
}
