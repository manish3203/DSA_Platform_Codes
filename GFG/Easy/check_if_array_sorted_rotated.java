/*

   Check if Array Is Sorted and Rotated

   Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.

	Example 1:
	Input:
	N = 5
	arr[] = {10, 20, 30, 40, 50}
	Output: 1
	Explanation: The given array is sorted.

	Example 2:
	Input:
	N = 6
	arr[] = {90, 80, 100, 70, 40, 30}
	Output: 0
	Explanation: The given array is not sorted.

	Your Task:
	You don't need to read input or print anything. Your task is to complete the function 
	arraySortedOrNot() which takes the arr[] and N as input parameters and returns a boolean 
	value (true if it is sorted otherwise false).
	

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
	1 ≤ N ≤ 105
	1 ≤ Arr[i] ≤ 106

*/

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            boolean ans = new Solution().arraySortedOrNot(arr, n);
            System.out.println(ans ? 1 : 0);
        }
    }
}


class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {

        int count = 0;

        if(arr[n-1]-arr[0] < 0) {

            count++;
        }

        for(int i=1; i<n; i++) {

            if((arr[i] - arr[i-1]) < 0) {

                count++;
            }
        }

        if(count > 1) {

            return false;
        }else {

            return true;
        }
    }
}
