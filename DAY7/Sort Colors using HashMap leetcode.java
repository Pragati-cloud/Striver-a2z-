class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,0);
        mp.put(1,0);
        mp.put(2,0);

        for(int num:nums){
            mp.put(num,mp.get(num)+1);
        }
        int x=0;
        for(int color=0;color<3;color++){
            int frq = mp.get(color);
            for (int j = 0; j < frq; j++) {
                nums[x] = color;
                x++;
            }
        }
    }
}
