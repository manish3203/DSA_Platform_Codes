/*

	Convert array into Zig-Zag fashion
	Company : Paytm, Amazon, Adobe
	Platform : GFG

	Description :
	Given an array arr of distinct elements of size N, the task is to rearrange the elements of
	the array in a zig-zag fashion so that the converted array should be in the below form:
	arr[0] < arr[1] > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n].
	NOTE: If your transformation is correct, the output will be 1 else the output will be 0.

	Example 1:
	Input:
	N = 7
	Arr[] = {4, 3, 7, 8, 6, 2, 1}
	Output: 3 7 4 8 2 6 1
	Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1

	Example 2:
	Input:
	N = 4
	Arr[] = {1, 4, 3, 2}
	Output: 1 4 2 3
	Explanation: 1 < 4 > 2 < 3
	
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
	1 <= N <= 106
	0 <= Arri <= 109

*/

class Solution{
    public void zigZag(int a[], int n){

        boolean flag = true;

        for (int i = 0; i < n - 1; i++) {
            if (flag) {

                if (a[i] > a[i + 1]) {

                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            } else {

                if (a[i] < a[i + 1]) {

                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            flag = !flag;
        }
    }
}

