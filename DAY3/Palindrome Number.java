class Solution {
    public boolean isPalindrome(int n) {
        int m=n, rev=0;
        while(n>0){
            int lastdigit=n%10;
            
            rev =(rev*10)+lastdigit;
            n=n/10;
            if(m ==rev){
                return true;
            }
        }
        return false;
    }
