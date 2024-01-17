
/*

	Leaders in an Array

	Company : PayU, Adobe, Microsoft, Synopsys, Coditas, Hashedln, Betsol
	Platform : GFG

	Description:
	Given an array A of positive integers. Your task is to find the leaders in the
	array. An element of an array is a leader if it is greater than or equal to all the
	elements to its right side. The rightmost element is always a leader.

	Example 1:
	Input:
	n = 6
	A[] = {16,17,4,3,5,2}
	Output: 17 5 2
	Explanation: The first leader is 17 as it is greater than all the elements to its right.
	Similarly, the next leader is 5. The right most element is always a leader so it is
	also included.

	Example 2:
	Input:
	n = 5
	A[] = {1,2,3,4,0}
	Output: 4 0
	Explanation: 0 is the rightmost element and 4 is the only element which is greater
	than all the elements to its right.

	Expected Time Complexity: O(n)
	Expected Auxiliary Space: O(n)

	Constraints:
	1 <= n <= 107
	0 <= Ai <= 107
*/

class Solution{

    static ArrayList<Integer> leaders(int arr[], int n){

        ArrayList<Integer> al = new ArrayList<>();

        int maxElement = Integer.MIN_VALUE;
        for(int i=arr.length-1; i >= 0; i--) {

            if(maxElement <= arr[i]) {

                al.add(arr[i]);
                maxElement = arr[i];
            }
        }
        Collections.reverse(al);
        return al;
    }
}

