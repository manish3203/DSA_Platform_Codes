/*

	Kth Largest Element in an Array

	Company: Amazon, Microsoft, Walmart, Adobe
	Platform: Leetcode - 215
	Striver’s and love Bubbar’s DSA sheet.

	Description:
	Given an integer array nums and an integer k, return the kth largest
	element in the array.
	Note that it is the kth largest element in the sorted order, not the kth distinct
	element.
	Can you solve it without sorting?

	Example 1:
	Input: nums = [3,2,1,5,6,4], k = 2
	Output: 5
	
	Example 2:
	Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
	Output: 4

	Constraints:
	1 <= k <= nums.length <= 105
	-104 <= nums[i] <= 104

*/

class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Initialize a PriorityQueue to store the k largest elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        /*In the loop we can add the element in queue and there are
        one condition if the size is greater than k then remove
        smallest element*/
        for(int data : nums) {

            pq.offer(data);
            if(pq.size() > k)
                pq.poll();
        }

        //return the element , which is kth largets element
        return pq.peek();
    }
}
