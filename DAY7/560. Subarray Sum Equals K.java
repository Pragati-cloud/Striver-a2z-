class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int preSum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i=0; i<n; i++) {
            preSum += nums[i];

            int rem = preSum - k;
            if(map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }
        return count;
    }
}
