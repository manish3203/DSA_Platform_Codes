/*

	Subarray Sum Equals K (Subarray with given sum-GFG)

	Company: Amazon, Facebook, Google, Visa
	Platform: Leetcode- 560, GFG, Coding Ninjas
	Striver’s DSA sheet

	Description
	Given an array of integers nums and an integer k, return the total number of subarrays
	whose sum equals to k.
	A subarray is a contiguous non-empty sequence of elements within an array.

	Example 1:
	Input: nums = [1,1,1], k = 2
	Output: 2

	Example 2:
	Input: nums = [1,2,3], k = 3
	Output: 2

	Constraints:
	1 <= nums.length <= 2 * 104
	-1000 <= nums[i] <= 1000
	-107 <= k <= 107

*/


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {

       ArrayList<Integer> al = new ArrayList<>();

        int sum = 0;
        int left = 0;

        for(int i = 0; i < n; i++){

            sum += arr[i];

            while(sum > s && i > left && left < n){

                sum -= arr[left];
                left++;
            }

            if(s == sum){

                al.add(left+1);
                al.add(i+1);
                break;
            }
        }

        if(s != sum){
            al.add(-1);
        }


        return al;
    }
}
