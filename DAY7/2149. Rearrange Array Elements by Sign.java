class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n =nums.length;
        int [] arr= new int[n];
        int positive =0;
        int negetive =1;

        for(int i =0; i<n;i++){
            if(nums[i]<0){
                arr[negetive] = nums[i];
                negetive +=2;
            }
            else{
                arr[positive] = nums[i];
                positive +=2;
            }
        }return arr;
    }
}
