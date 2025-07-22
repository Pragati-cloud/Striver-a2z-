//LINK =https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int m =n,  rem =0;

        while(n>0){
            int ld = n%10;
            rem += ld * ld * ld;
            n=n/10;
        }
        if(rem ==m ) return true;
        else return false;
        
    }
}
