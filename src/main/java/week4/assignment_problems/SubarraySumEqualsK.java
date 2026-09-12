package main.java.week4.assignment_problems;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        // Calculate prefix sums for the array
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        // Check all contiguous subarray sums
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum;
                if (i == 0) {
                    currentSum = prefixSum[j];
                } else {
                    currentSum = prefixSum[j] - prefixSum[i - 1];
                }

                if (currentSum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(subarraySum(new int[]{1, -1, 0}, 0));
    }
}
