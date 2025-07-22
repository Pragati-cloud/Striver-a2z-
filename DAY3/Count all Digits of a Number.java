//link =https://takeuforward.org/plus/dsa/problems/count-all-digits-of-a-number

class Solution {
    public int countDigit(int n) {
        int count=0;

        while(n>0){
            count+=1;
            n=n/10;
        }
        return count;
    }
}
