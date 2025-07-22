// Link =https://takeuforward.org/plus/dsa/problems/reverse-a-number

class Solution {
public:
    int reverseNumber(int n) {
        int rem=0;
       while(n>0){
          int lastdigit=n%10;
          
          n=n/10;
          rem=(rem*10)+lastdigit;
       }
       return rem;
    }
};
