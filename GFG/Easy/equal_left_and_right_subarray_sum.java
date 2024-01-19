
/*

	Equal Left and Right Subarray Sum
	
	Company : Amazon, Adobe
	Platform : GFG

	Description :
	Given an array A of n positive numbers. The task is to find the first index in the
	array such that the sum of elements before it equals the sum of elements after it.
	
	Note: Array is 1-based indexed.
	
	Example 1:
	Input:
	n = 5
	A[] = {1,3,5,2,2}
	Output: 3
	Explanation: For second test case at position 3 elements before it (1+3) =
	elements after it (2+2).

	Example 2:
	Input:
	n = 1
	A[] = {1}
	Output: 1
	Explanation: Since it's the only element hence it is the only point.
	
	Expected Time Complexity: O(N)
	Expected Space Complexity: O(1)
	
	Constraints:
	1 <= n <= 106
	1 <= A[i] <= 108
*/

class Solution{
	int equalSum(int [] A, int N) {

		int totalSum = 0;
		int leftSum = 0;

		for(int data : A) {

		    totalSum+=data;
		}
		for(int i=0; i<A.length; i++) {

		    if(leftSum == totalSum - leftSum - A[i]) {

		        return i+1;
		    }
		    leftSum+=A[i];
		}
		return -1;
	}
}
