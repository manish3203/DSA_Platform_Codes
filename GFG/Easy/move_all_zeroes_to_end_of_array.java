/*

	Move Zeroes To End Of Array

	Company: Paytm, Amazon, Microsoft, Samsung, SAP Labs, Linkedin,
	Bloomberg, BlueStack
	Platform:Leetcode-283, GFG
	Fraz’s and Striver’s SDE Sheet

	Description:
	Given an integer array nums, move all 0's to the end of it while maintaining
	the relative order of the non-zero elements.
	Note that you must do this in-place without making a copy of the array.

	Example 1:
	Input: arr = [0,1,0,3,12]
	Output: [1,3,12,0,0]

	Example 2:
	Input: arr = [0]
	Output: [0]
	
	Constraints:
	1 <= nums.length <= 104
	-231 <= nums[i] <= 231 - 1

*/

class Solution {
    void pushZerosToEnd(int[] arr, int n) {

        int j = 0;
        for(int i=0; i<n; i++) {

            if(arr[i] != 0) {

                arr[j] = arr[i];
                j++;
            }
        }
        while(j < n) {

            arr[j] = 0;
            j++;
        }
    }
}
