class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] result = new int[nums.length];
        
        for (int num : nums) {
            count[num]++;
        }
        
        int runningSum = 0;
        for (int i = 0; i < count.length; i++) {
            int currentCount = count[i];
            count[i] = runningSum;
            runningSum += currentCount;
        }
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }
        
        return result;
    }
}