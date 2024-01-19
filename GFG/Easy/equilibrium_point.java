
/*

	Equilibrium Point
	Company : Amazon, Adobe
	Platform : GFG

	Description :
	Given an array A of n non negative numbers. The task is to find the first
	equilibrium point in an array. Equilibrium point in an array is an index (or position) such
	that the sum of all elements before that index is the same as the sum of elements after
	it.

	Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.

	Example 1:
	Input:
	n = 5
	A[] = {1,3,5,2,2}
	Output: 3
	Explanation: The equilibrium point is at position 3 as the sum of elements
	before it (1+3) = sum of elements after it (2+2).

	Example 2:
	Input:
	n = 1
	A[] = {1}
	Output: 1
	Explanation: Since there's only an element hence its only the equilibrium point.
	
	Expected Time Complexity: O(n)
	Expected Auxiliary Space: O(1)

	Constraints:
	1 <= n <= 105
	0 <= A[i] <= 109
*/

class Solution {


    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        long leftSum = 0;
        long data = -1;
        long totSum = 0;

        for(long element : arr){

            totSum = totSum+element;
        };

        for(int i=0; i<arr.length; i++) {

            if(leftSum == totSum-leftSum-arr[i]) {

                data = i+1;
                break;
            }
            leftSum = leftSum+arr[i];
        }
        return (int)data;
    }
}
