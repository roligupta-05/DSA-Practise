public class MaximumSubArray {
    
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        
        int currentSum = nums[0];
        int maxSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add to the existing subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update the global maximum if currentSum is larger
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result); // Output: 6
    }
}