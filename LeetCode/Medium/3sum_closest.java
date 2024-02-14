/*

	3Sum Closest

	Company: Amazon, Facebook, Microsoft, LinkedIn, Airbnb, Oracle
	Platform: leetcode-16
	Fraz’s DSA sheet

	Description:
	Given an integer array nums of length n and an integer target, find three integers in
	nums such that the sum is closest to target.
	Return the sum of the three integers.
	You may assume that each input would have exactly one solution.
	
	Example 1:
	Input: nums = [-1,2,1,-4], target = 1
	Output: 2
	Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

	Example 2:
	Input: nums = [0,0,0], target = 1
	Output: 0
	Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

	Constraints:
	3 <= nums.length <= 500
	-1000 <= nums[i] <= 1000
	-104 <= target <= 104


*/


class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int min = Integer.MAX_VALUE;
        int sum = 0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {

            int start = i+1;
            int end = nums.length-1;

            while(start < end) {

                sum = nums[i] + nums[start] + nums[end];

                if((Math.abs(sum-target) < Math.abs(target - min))) {

                    min = sum;
                }else if (sum < target) {

                    start++;
                }else {

                    end--;
                }
            }
        }
        return min;
    }
}
