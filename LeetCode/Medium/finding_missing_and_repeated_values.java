/*

	find missing and repeated values

	Company: Flipkart, Amazon, sharechat, goldman sachs,accenture, techmahindra
	Platform: GFG, Coding ninjas, leetcode-2965
	Fraz’s DSA sheet.

	Description:
	Problem statement
	You are given an array of size ‘N’. The elements of the array are in the
	range from 1 to ‘N’.
	Ideally, the array should contain elements from 1 to ‘N’. But due to some
	miscalculations, there is a number R in the range [1, N] which appears in
	the array twice and another number M in the range [1, N] which is missing
	from the array.
	Your task is to find the missing number (M) and the repeating number (R).
	
	For example:
	Consider an array of size six. The elements of the array are { 6, 4, 3, 5, 5, 1 }.
	The array should contain elements from one to six. Here, 2 is not present
	and 5 is occurring twice. Thus, 2 is the missing number (M) and 5 is the
	repeating number (R).
	Follow Up
	Can you do this in linear time and constant additional space?
	Detailed explanation ( Input/output format, Notes, Images )

	Constraints:
	2 <= N <= 5 * 10^4
	1 <= data <= N

*/

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[grid.length*grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                arr[grid[i][j]-1]++;
            }
        }
        int ans[]=new int[2];
        int a=0,b=0;
        for(int i=0;i<grid.length*grid.length;i++){
            if(arr[i]==2) {
                a=i+1;
            }else if(arr[i]==0){
                b=i+1;
            }
        }
        ans[0]=a;
        ans[1]=b;

        return ans;

    }
}
