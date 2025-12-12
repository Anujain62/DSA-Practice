
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        int i = 0, j = 0;

        double avg = Double.NEGATIVE_INFINITY;  // FIX

        while (j < k) {
            sum += nums[j];
            j++;
        }

        double temp = sum / k;
        avg = Math.max(avg, temp);

        while (j < nums.length) {
            sum += nums[j];
            sum -= nums[i];

            temp = sum / k;
            avg = Math.max(avg, temp);

            j++;
            i++;
        }

        return avg;
    }
}
