class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int maxVal = 100000; 
        int[] freq = new int[maxVal + 1];
        long sum = 0;
        long max = 0;
        int dup = 0;
        for (int i = 0; i < k; i++) {
            int val = nums[i];
            freq[val]++;
            if (freq[val] == 2) dup++;
            sum += val;
        }
        if (dup == 0) max = sum;
        for (int i = k; i < nums.length; i++) {
            int add = nums[i];
            int remove = nums[i - k];
            freq[add]++;
            if (freq[add] == 2) dup++;
            sum += add;
            if (freq[remove] == 2) dup--;
            freq[remove]--;
            sum -= remove;
            if (dup == 0) max = Math.max(max, sum);
        }
        return max;
    }
}


